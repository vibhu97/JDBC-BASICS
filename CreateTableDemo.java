
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:postgresql://localhost:5432/Tester";//Postgresql Having a DATABASE Named Tester
		String username="postgres";
		String password="54395439";
		String sqlQuery="Create table MYEmployees(eno integer,ename character varying(20),esal real,eaddress character varying (20))";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		st.executeUpdate(sqlQuery);
		System.out.println("Table created Sucessfully");
		con.close();
	}

}
