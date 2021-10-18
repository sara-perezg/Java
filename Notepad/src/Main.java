import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Runtime rs = Runtime.getRuntime();
		try {
			rs.exec("notepad");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
