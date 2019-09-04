package Jdbc;
import java.sql.*;

public class CreateTable {
public static void main(String[] args) throws ClassNotFoundException, SQLException
{
	//int id=001;
	//String first_name="Abi";
	//String last_name="vedhaa";
	//int age=10;
	//String gender="female";
//	String table_name = "Career";
	
 Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
        Statement st=c.createStatement();
       /* DatabaseMetaData dbm = c.getMetaData();
        ResultSet tables = dbm.getTables(null, null, table_name, null);
      // ResultSet rs =  st.executeQuery("select Career from user_tables");
    	  if (tables.next()) {
    			System.out.println("Table aready exists");
    		  }
		else {

  		  Sys    tem.out.println("Condition");*/
  		 // st.executeUpdate("create table Career (id number(6),first_name varchar(30),last_name varchar(30),age number(20),gender varchar(10))");
		//String q1="insert into Career values ( 1,'Abi','Vedhha',10,'female')" ;
		String q1="insert into Career values(2,'vedhha','Shri',4,'female')";
		//int x = st.executeUpdate(q1);
		int x=st.executeUpdate(q1);
		if (x>0) {
			System.out.println("Sucess");
		}
  		  c.close();
}
}

	//}

