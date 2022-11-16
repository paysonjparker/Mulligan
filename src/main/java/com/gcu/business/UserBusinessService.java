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
 *
 */
@Service
public class UserBusinessService {

	@Autowired
	private DataAccessInterface<UserModel> service;

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

}
