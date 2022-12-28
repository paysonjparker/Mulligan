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

	/**
	 * User data service.
	 */
	@Autowired
	private DataAccessInterface<UserModel> userDataService; //implemented data access interface with UserModel data type

	/**
	 * Returns all Users from database
	 * 
	 * @return list of Users
	 */
	public List<UserModel> getUsers() {
		return userDataService.findAll(); //gets all exsiting posts from the database
	}

	/**
	 * Adds a user to the database.
	 * 
	 * @param user User model being added to the database.
	 */
	public void addUser(UserModel user) {
		userDataService.create(user); //creates a new userModel and adds it to the database
	}
	
	/**
	 * Finds a user by username.
	 * @param username username being searched.
	 * @return The UserModel of that username if it is found.
	 */
	public UserModel getUserByUsername(String username) {
		return userDataService.findByUsername(username); //gets a single user by the specified ID number
	}

}
