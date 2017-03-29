package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.User;
import com.example.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User findById(Long id) {
		User user = userRepository.findOne(id);
		return user;
	}

	@Override
	public List<User> findByName(String name) {
		List<User> users = userRepository.findByName(name);
		return users;
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void updateUser(User user) {
		saveUser(user);
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.delete(id);
	}
	
	@Override
	public void deleteUser(User user){
		userRepository.delete(user);
	}

	@Override
	public void deleteAllUsers() {
		userRepository.deleteAll();
	}

	@Override
	public List<User> findAllUsers() {
		List<User> users = userRepository.findAll();
		return users;
	}

	@Override
	public boolean isUserExist(User user) {
		return findByName(user.getName()) != null;
	}
	
}
