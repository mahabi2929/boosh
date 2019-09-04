package Jdbc;

import java.sql.*;

public class JdbcCRUD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
          String query="insert into Student values (?,?)";
          String q1="delete from Student where id=4";
          String q2="insert into Student values (?,?)";
          String q3="select * from Student";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
		/*PreparedStatement st=con.prepareStatement(query);
		int id=5;
		String Sname="abi";
		st.setInt(1, id);
		st.setString(2, Sname);
		int ps=st.executeUpdate();
		{
		System.out.println(ps+"row/s affected");
		}
		st.close();*/
		PreparedStatement st5=con.prepareStatement(q2);
		int id=8;
		String Sname="maha";
		st5.setInt(1, id);
		st5.setString(2, Sname);
		int ps1=st5.executeUpdate();
		{
			System.out.println("sucess");
		}
		st5.close();
		/*Statement st1=con.createStatement();
		ResultSet rs=st1.executeQuery(q1);
		rs.next();
		st1.close();*/
		Statement st4=con.createStatement();
		ResultSet rs=st4.executeQuery(q3);
		while(rs.next())
		{
		String S1=rs.getInt(1)+":"+rs.getString(2 );
		System.out.println(S1);
		}
		st4.close();
		con.close();


	}

}
