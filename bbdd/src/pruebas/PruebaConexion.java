package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PruebaConexion {

	public static void main(String[] args) {
		// Probamos la conexion con BBDD mysql

		// Cargamos el driver de JDBC
		try {
			Class.forName("com.mysql.jdbc.Driver");

			// Conectar con la base de datos
			// Primero preparamos la url de conexion
			String url = "jdbc:mysql://localhost/agenda";

			// Creo el objeto conexion
			Connection conexion = DriverManager.getConnection(url, "root", "");

			// Ahora lo que tenemos que hacer es lanzar sentencias SQL
			// Preparamos el objeto Sentencia(Statement)
			Statement sentencia = conexion.createStatement();

			/*
			 * // Preparamos el insert String sql =
			 * "INSERT INTO contacto VALUES ('Javier', 681246962)";
			 * sentencia.executeUpdate(sql); sql =
			 * "INSERT INTO contacto VALUES ('María', 603939833)";
			 * sentencia.executeUpdate(sql); sql =
			 * "INSERT INTO contacto VALUES ('Luis', 66656443)";
			 * sentencia.executeUpdate(sql);
			 */

			/*
			 * // Lanzar UPDATE String sql =
			 * "UPDATE contacto SET telefono='666666666' WHERE nombre='Javier'";
			 * sentencia.executeUpdate(sql);
			 */

			/*
			 * // Deberiamos hacer un COMMIT para validar los cambios, aunque MySQL tiene
			 * autocommit conexion.commit();
			 */

			// Lanzar un SELECT
			String sql = "SELECT * FROM contacto";
			ResultSet resultado = sentencia.executeQuery(sql);

			/*
			// Avanzo y me situo en la primera tupla
			resultado.next();
			System.out.println(resultado.getString("nombre"));
			System.out.println(resultado.getLong("telefono"));

			// Avanzo y me situo en la segunda tupla
			resultado.next();
			System.out.println(resultado.getString(1));
			System.out.println(resultado.getLong(2));
			*/
			
			while (resultado.next()) {
				System.out.println(resultado.getString(1));
				System.out.println(resultado.getLong(2));
			}
			

		} catch (ClassNotFoundException e) {
			System.out.println("Error cargando el driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error conectando a la base de datos");
			e.printStackTrace();
		}

	}

}
