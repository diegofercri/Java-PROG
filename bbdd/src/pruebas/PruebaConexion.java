package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
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
			
			// Preparamos el insert
			String sql = "INSERT INTO contacto VALUES ('Javier',657383732)";
			sentencia.executeUpdate(sql);
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error cargando el driver");
			e.printStackTrace();
		} catch (SQLException e){
			System.out.println("Error conectando a la base de datos");
			e.printStackTrace();
		}

	}

}
