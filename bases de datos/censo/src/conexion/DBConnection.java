package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private Connection conexion;

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	public DBConnection()  {
		try {
		// Cargar el driver JDBC
		Class.forName("com.mysql.jdbc.Driver");

		// Conectar con la BBDD
		// Primero preparamos la url de conexión
		String url = "jdbc:mysql://localhost/censo";
		//Creo el objeto Conexion: Ponemos la url, el usuario y la contraseña
		conexion = DriverManager.getConnection(url, "root", "");

	} catch (ClassNotFoundException e) {
		System.out.println("Error cargando el Driver");
		e.printStackTrace();
	} catch (SQLException e) {
		System.out.println("Error en sentencia SQL");
		e.printStackTrace();
	}
	}

}
