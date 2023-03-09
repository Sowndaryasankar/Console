package com.zsgs.contact.contactinfo;

import java.util.ArrayList;
import java.util.List;
import com.zsgs.contact.dao.*;
import com.zsgs.contact.repository.ContactRepositoryDb;

public class ContactHomeModel implements ContactHomeModelCallBack {
	private ContactHomeControllerCallBack contactHomeController;

	public ContactHomeModel(ContactHomeController contactHomeController) {
		this.contactHomeController = contactHomeController;
	}

	public List<Contact> showContact() {
		List<Contact> showContactList = new ArrayList<>();
		try {
			showContactList = ContactRepositoryDb.getInstance().showContact();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return showContactList;

	}

	public void addContact(Contact contact) {

		try {
			ContactRepositoryDb.getInstance().addContact(contact);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void removeContact(int contactId) {
		try {
			ContactRepositoryDb.getInstance().removeContact(contactId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void editContact(int contactId, String fieldToBeupdated, String updatedValue) {
		try {
			ContactRepositoryDb.getInstance().editContact(contactId, fieldToBeupdated, updatedValue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public interface ContactHomeModelControlerCallBack {

	}

}

