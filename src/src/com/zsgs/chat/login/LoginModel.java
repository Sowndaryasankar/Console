package com.zsgs.chat.login;

import com.zsgs.chat.dao.User;
import com.zsgs.chat.repository.ChatRepository;

public class LoginModel {
private LoginController loginController;
	
	public LoginModel(LoginController loginController) {
		this.loginController = loginController;
	}

	
	public User checkCredentials(String userName, String password) {
	
		User user = ChatRepository.getInstance().checkValidUser(userName,password);
		if (user !=null) {
			loginController.loginSuccess(user);
		} else {
			loginController.loginFailiure("\nInvalid Credentials. Please try again!\n");
		}
		return null;

	}
}


