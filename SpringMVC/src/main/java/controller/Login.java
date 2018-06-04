package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {
	@RequestMapping("/login")
	public String login(String username,String password) {
		if(username.equals("abc")&&password.equals("123456")){
			return "ok";
		}
		else {
			return "no";
		}
		
	}

}
