package service;

import java.sql.SQLException;

import dao.UserinfoDao;

public class UserinfoService {
public boolean login(String username,String password) throws ClassNotFoundException, SQLException {
	UserinfoDao dao=new UserinfoDao();
	if(dao.findUserinfo(username, password)==null) {
		return false;	
	}
	else {
		return true;
	}
}
}
