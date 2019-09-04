package Jdbc;
import java.sql.*;
public class Connect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
			if(con !=null)
				System.out.println("connected");
			else
				System.out.println("Not Connected");
			con.close();
	}

}
 