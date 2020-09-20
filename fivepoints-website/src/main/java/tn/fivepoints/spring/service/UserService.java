package tn.fivepoints.spring.service;

import java.util.List;

import tn.fivepoints.spring.entities.User;

public interface UserService {
	
	User addUser(User user);
	void deleteUser(int id);
	List<User> showAllUsers();
	User getUserById(int id);
	
}
