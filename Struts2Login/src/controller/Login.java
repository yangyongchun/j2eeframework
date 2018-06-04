package controller;

import java.sql.SQLException;

import service.UserinfoService;

public class Login {

	private String username;
	private String password;
	public String execute() throws ClassNotFoundException, SQLException {
		UserinfoService service=new UserinfoService();
		if(service.login(username, password)) {
			return "ok";
		}
		else {
			return "no";
		}
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
