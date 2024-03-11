package cricket;

import java.sql.*;

public class Player {
public static void main(String[] args) {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/siva";
	String username = "root";
	String password = "root";
	try {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,username,password);
		//String query = "update cricket set team = ? where age=42";
		//String query = "alter table cricket  DROP COLUMN team";
		String query = "alter table  cricket RENAME column (100/50) TO (Score)";
		//String query = "alter table cricket add column team varchar(10)";
		
		PreparedStatement s = con.prepareStatement(query);
		//s.setString(1,"Gr");
		//s.executeUpdate();
		//s.execute();
		s.execute();
		con.close();
	}
	
	catch(Exception e)
	{	
		System.out.println(e);
	} 
	
}
}
 