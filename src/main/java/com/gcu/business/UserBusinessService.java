/**
 * 
 */
package com.gcu.business;

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
	
	
}
