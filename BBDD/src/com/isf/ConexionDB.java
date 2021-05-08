package com.isf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {
	Connection conexion;
	Statement statement;
	
	public ConexionDB() {
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
	
	public void consultaPorPuesto(String puesto) {
		try {
			String query = String.format("SELECT empleado.id, empleado.Nombre, puestos.Nombre FROM empleado, puestos"
					+ " WHERE puestos.id_empleado = empleado.id AND puestos.Nombre = '%s'", puesto);
			ResultSet rs = statement.executeQuery(query);
			System.out.print("ID | Nombre | Puesto ");
			System.out.printf("\n---------------------");
			while(rs.next()) {
				System.out.printf("\n %s | %s | %s",rs.getString(1),rs.getString(2),rs.getString(3));
			}
			System.out.println("\n---------------------");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getEmpleadoByID(int id) {
		String idS = Integer.toString(id);
		String query = String.format("SELECT * FROM empleado WHERE id = %s",idS);
		
		try {
			ResultSet rs = statement.executeQuery(query);
			System.out.println("ID | Nombre");
			while(rs.next()) {
				System.out.println("-----------");
				System.out.printf("%s | %s", rs.getString(1), rs.getString(2));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error de lectura");
		}
	}
	
	public void showAllEmpleados() {
		String query = "SELECT * FROM empleado";
		try {
			ResultSet rs = statement.executeQuery(query);
			System.out.println("\nID | Nombre");
			System.out.println("-----------");
			while(rs.next()) {
				System.out.printf("%s | %s\n", rs.getString(1), rs.getString(2));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error de lectura");
		}
	}
	
	public void insertEmpleado(String id, String nombre) {
		try {
			String query = String.format("INSERT INTO empleado VALUES(%s, '%s');",id,nombre);
			statement.executeUpdate(query);
			System.out.println("Nuevos datos en empleados...");
			showAllEmpleados();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error de insercion");
		}
	}
	
}
