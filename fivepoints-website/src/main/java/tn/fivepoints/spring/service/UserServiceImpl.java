package tn.fivepoints.spring.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.fivepoints.spring.entities.User;
import tn.fivepoints.spring.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
	
	
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userRepository.delete(userRepository.findById(id).get());		
	}

	@Override
	public List<User> showAllUsers() {
		// TODO Auto-generated method stub
		List<User> users=(List<User>)userRepository.findAll();
		return users;
		
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}


	


}
