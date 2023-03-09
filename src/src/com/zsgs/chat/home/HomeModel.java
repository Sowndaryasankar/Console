package com.zsgs.chat.home;

import java.util.List;

import com.zsgs.chat.dao.Message;
import com.zsgs.chat.dao.User;
import com.zsgs.chat.repository.ChatRepository;

public class HomeModel {
	private HomeController HomeController ;
	
	

	public HomeModel(com.zsgs.chat.home.HomeController homeController) {
		this.HomeController=homeController;
	}

	public List<Message> getReceivedMessage(User user) {
		List<Message> receivedMessages =ChatRepository.getInstance().getReceivedMessage(user);
		return receivedMessages;
	}

	public List<Message> getSentMessage(User user) {
		List<Message> sentMessages =ChatRepository.getInstance().getSentMessage(user);
		return sentMessages;
	}

	public boolean updateNewMessage(Message newMessage) {
		return ChatRepository.getInstance().updateNewMessage(newMessage);
		
	}

	public boolean validateSender(String receiverUserName) {
		return ChatRepository.getInstance().checkValidReceiver(receiverUserName);
		
	}
}


