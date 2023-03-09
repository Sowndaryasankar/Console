package com.zsgs.contact.contactinfo;

import java.util.List;

import com.zsgs.contact.dao.Contact;

public interface ContactHomeViewCallBack {
	Contact addContact();

	void index();

	int removeContact();

	int editContact();

	String geteditContactField();

	String getUpdatedValue();

	void print(List<Contact> showContactList);

}

