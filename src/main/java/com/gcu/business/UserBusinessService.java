/**
 * 
 */
package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.data.DataAccessInterface;
import com.gcu.model.UserModel;

/**
 * @author paysonparker
 * User Business service class.
 */
@Service
public class UserBusinessService {

	@Autowired
	private DataAccessInterface<UserModel> service; //implemented data access interface with UserModel data type

	/**
	 * Returns all Users from database
	 * 
	 * @return list of Users
	 */
	public List<UserModel> getUsers() {
		return service.findAll();
	}

	/**
	 * Adds a user to the database.
	 * 
	 * @param user User model being added to the database.
	 */
	public void addUser(UserModel user) {
		service.create(user);
	}
	
	/**
	 * Finds a user by username.
	 * @param username username being searched.
	 * @return The UserModel of that username if it is found.
	 */
	public UserModel getUserByUsername(String username) {
		return service.findByUsername(username);
	}

}
