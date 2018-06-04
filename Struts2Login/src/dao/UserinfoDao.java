package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Userinfo;

public class UserinfoDao {
	public Userinfo findUserinfo(String username,String password) throws ClassNotFoundException, SQLException {
		Userinfo user=null;
		String sql="select *from user where username=? and password=?";
		
		Connection conn=GetConnection.getConnection();
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			user=new Userinfo();
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
		}
		rs.close();
		ps.close();
		conn.close();
		return user;
		
	}

}
