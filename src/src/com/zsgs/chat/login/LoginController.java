package com.zsgs.chat.login;

import com.zsgs.chat.dao.User;

public class LoginController {
	LoginView loginView;
	LoginModel  loginModel;
	
	public LoginController(LoginView loginView) {
		this.loginView = loginView;
		this.loginModel = new LoginModel(this);
	}


		public void checkCredentials(String userName, String password) {
			loginModel.checkCredentials(userName,password);
		}

		public void loginSuccess(User user) {
			loginView.loginSuccess(user);
		}

		public void loginFailiure(String errorMessage) {
			loginView.loginFailed(errorMessage);	
		}
		
	}

