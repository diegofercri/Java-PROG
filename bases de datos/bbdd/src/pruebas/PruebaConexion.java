package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PruebaConexion {

	public static void main(String[] args) {
		// Probamos la conexión con BBDD mysql

		try {
			// Cargar el driver JDBC
			Class.forName("com.mysql.jdbc.Driver");

			// Conectar con la BBDD
			// Primero preparamos la url de conexión
			String url = "jdbc:mysql://localhost/agenda";
			//Creo el objeto Conexion: Ponemos la url, el usuario y la contraseña
			Connection conexion = DriverManager.getConnection(url, "root", "");

			// Lanzar sentencias SQL
			// Preparamos el objeto Sentencia(Statement)
			Statement sentencia = conexion.createStatement();
			
			/*
			// Preparar el INSERT
			String sql = "INSERT INTO contacto VALUES('Daniel', '675913465')";
			sentencia.executeUpdate(sql);
			sql = "INSERT INTO contacto VALUES('Luis', '843657612')";
			sentencia.executeUpdate(sql);
			sql = "INSERT INTO contacto VALUES('Maria', '923546789')";
			sentencia.executeUpdate(sql);
			*/
			
			/*
			// Lanzar un UPDATE
			String sql = "UPDATE contacto SET telefono=666666666 WHERE nombre='Maria'";
			sentencia.executeUpdate(sql);
			*/
			
			/*
			// Deberíamos hacer un COMIT para validar los cambios, aunque MySQL tiene autocomit
			conexion.commit(); //no lo usamos porque tenemos autocomit
			*/
			
			// Lanzar un SELECT
			String sql = "SELECT * FROM contacto";
			ResultSet resultado = sentencia.executeQuery(sql);
				
			/*
			// Avanzo y me situo en la primera dupla
			resultado.next();
			System.out.println(resultado.getString("nombre"));
			System.out.println(resultado.getLong("telefono"));
			resultado.next();
			System.out.println(resultado.getString(1));
			System.out.println(resultado.getLong(2));
			resultado.next();
			System.out.println(resultado.getString(1));
			System.out.println(resultado.getLong(2));
			resultado.next();
			System.out.println(resultado.getString(1));
			System.out.println(resultado.getLong(2));
			*/
			
			// Mostramos todas las tuplas obtenidas
			while (resultado.next()) {
				System.out.println(resultado.getString(1) + " " + resultado.getLong(2));
			} 

		} catch (ClassNotFoundException e) {
			System.out.println("Error cargando el Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error en sentencia SQL");
			e.printStackTrace();
		}
	}

}