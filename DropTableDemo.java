import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTableDemo {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:postgresql://localhost:5432/Tester";
		String username="postgres";
		String password="54395439";
		String sqlQuery="Drop table employees";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		st.executeUpdate(sqlQuery);
		System.out.println("Table Deleted Sucessfully");
		con.close();
	}

}
