package tn.fivepoints.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.fivepoints.spring.entities.Contact;
import tn.fivepoints.spring.entities.Training;
import tn.fivepoints.spring.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	public static final Logger L = LogManager.getLogger(ContactServiceImpl.class);
	
	@Autowired
	ContactRepository contactRepository;

	@Override
	public Contact addMessage(Contact contact) {
		// TODO Auto-generated method stub
		return contactRepository.save(contact);
	}

	@Override
	public void deleteMessage(int id) {
		// TODO Auto-generated method stub
		contactRepository.delete(contactRepository.findById(id).get());
		
	}

	@Override
	public List<Contact> showAllMessages() {
		// TODO Auto-generated method stub
		List<Contact> t=(List<Contact>) contactRepository.findAll();
		
		return t;
	}

	@Override
	public Contact getMessageById(int id) {
		// TODO Auto-generated method stub
		return contactRepository.findById(id).get();	
	}

	@Override
	public Contact updateMessage(Contact contact) {
		// TODO Auto-generated method stub
		return contactRepository.save(contact);
	}
	
		

}

	
