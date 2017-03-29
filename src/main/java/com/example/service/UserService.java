package com.example.service;

import java.util.List;

import com.example.model.User;

public interface UserService {

	User findById(Long id);
	
	List<User> findByName(String name);

    void saveUser(User user);
 
    void updateUser(User user);
 
    void deleteUserById(Long id);
    
    void deleteUser(User user);
 
    void deleteAllUsers();
 
    List<User> findAllUsers();
 
    boolean isUserExist(User user);
	
}
