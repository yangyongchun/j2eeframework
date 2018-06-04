package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/struts";
		String user="root";
		String password="yyc19970204";
		String driver="com.mysql.jdbc.Driver";
		Connection conn;
		
		Class.forName(driver);
		conn=DriverManager.getConnection(url,user,password);
		return conn;
	}
}
