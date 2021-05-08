package com.isf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectorDB {
	Connection conexion;
	Statement statement;
	
	public ConectorDB() {
		super();
		try {
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebaut13", "root","");
			this.statement = conexion.createStatement(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error de conexion");
			e.printStackTrace();
		}
	}
	
	public void insertEmpleado(String nombre, String apellido1, String apellido2) {
		try {
			String query = String.format("INSERT INTO empleados (nombre,apellido1,apellido2) VALUES('%s', '%s', '%s');",nombre,apellido1,apellido2);
			statement.executeUpdate(query);
			System.out.println("\nNuevos datos en empleados...");
			showAllEmpleados();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error de insercion. Compruebe que el id no existiese con anterioridad");
		}
	}
	public void showAllEmpleados() {
		String query = "SELECT * FROM empleados";
		try {
			ResultSet rs = statement.executeQuery(query);
			System.out.println("\nID | Nombre | Apellido1 | Apellido2");
			System.out.println("---------------------------------");
			while(rs.next()) {
				System.out.printf("%s | %s | %s | %s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error de lectura");
		}
	}
	
	public void deleteEmpleado(String id) {
		try {
			String query = String.format("DELETE FROM empleados WHERE id = %s;",id);
			statement.executeUpdate(query);
			System.out.printf("Eliminando empleado con id = %s...\n",id);
			System.out.println("\nMostrando nueva tabla de empleados");
			showAllEmpleados();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error en la eliminación, compruebe que el id introducido es el correcto");
		}
	}
	
	public void updateNombreEmpleado(String id, String nombre) {
		try {
			String query = String.format("UPDATE empleados SET nombre = '%s' WHERE id = %s;",nombre,id);
			statement.executeUpdate(query);
			System.out.printf("Actualizando empleado con id = %s...\n",id);
			System.out.println("\nMostrando los nuevos datos de empelado...");
			showEmpleadoByID(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error en la actualizacion, compruebe que el id introducido es el correcto");
		}
	}
	
	public void showEmpleadoByID(String id) {
		String query = String.format("SELECT * FROM empleados WHERE id = %s",id);
		
		try {
			ResultSet rs = statement.executeQuery(query);
			System.out.println("\nID | Nombre | Apellido1 | Apellido2");
			System.out.println("---------------------------------");
			while(rs.next()) {
				System.out.printf("%s | %s | %s | %s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error de lectura");
		}
	}
}
