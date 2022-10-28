/**
 * 
 */
package com.gcu.data;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gcu.model.UserModel;

/**
 * @author paysonparker
 * test comment
 */
@Service
public class UserDataService implements DataAccessInterface<UserModel> {

	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(UserModel userModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(UserModel userModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(UserModel userModel) {
		// TODO Auto-generated method stub
		return false;
	}

}
