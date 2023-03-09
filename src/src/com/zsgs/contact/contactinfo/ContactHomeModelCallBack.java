package com.zsgs.contact.contactinfo;

import java.util.List;

import com.zsgs.contact.dao.Contact;

public interface ContactHomeModelCallBack {
	void addContact(Contact contact);

	void removeContact(int contactId);

	List<Contact> showContact();

	void editContact(int contactId, String fieldToBeupdated, String updatedValue);

}


