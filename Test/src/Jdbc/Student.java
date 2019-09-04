
   package Jdbc;

import java.sql.*;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String query="select * from Student";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
		String S1=rs.getInt(1)+"| "+rs.getString(2 );
		System.out.println(S1);
		}
		
		st.close();
		con.close();
}


}
