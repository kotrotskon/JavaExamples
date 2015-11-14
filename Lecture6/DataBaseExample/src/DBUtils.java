import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	private static final String DATABASE = "jdbc:mysql://localhost/users_db";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(DATABASE, USERNAME, PASSWORD);
	}

}
