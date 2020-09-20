package tn.fivepoints.spring.service;

import java.util.List;

import tn.fivepoints.spring.entities.Contact;
import tn.fivepoints.spring.entities.Training;

public interface ContactService {
	Contact addMessage(Contact contact);
	void deleteMessage(int id);
	List<Contact> showAllMessages();
	Contact getMessageById(int id);
	Contact updateMessage(Contact contact);
}
