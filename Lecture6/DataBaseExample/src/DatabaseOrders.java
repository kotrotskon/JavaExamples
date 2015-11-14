import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseOrders {

	public ArrayList<String> select(int pos) throws SQLException{
		Connection connection = DBUtils.getConnection();
		Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ArrayList<String> results = new ArrayList<>();
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM users");
		
		while (rs.next()) {
			results.add(rs.getString(pos));
		}
		
		return results;
		
	}
	
	public boolean insert(String name, String lname) throws SQLException{
		Connection connection = DBUtils.getConnection();
		Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		return stmt.execute("INSERT INTO users (fname, lname, username, email, pass)" + 
				"VALUES ('" + name + "', '"+lname+"', 'manol', 'mano@gmail.com', '52123')");
	}
	
	public boolean delete(String username) throws SQLException{
		Connection connection = DBUtils.getConnection();
		Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		return stmt.execute("DELETE FROM users where username='"+username+"'");
	}

}
