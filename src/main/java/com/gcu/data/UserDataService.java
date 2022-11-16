/**
 * 
 */
package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.gcu.model.UserModel;

/**
 * @author paysonparker
 * 
 */
@Service
public class UserDataService implements DataAccessInterface<UserModel> {

	@Autowired
	@SuppressWarnings("unused")
	private DataSource dataSource;

	private JdbcTemplate jdbcTemplateObject;

	/**
	 * Constructor for this class. Creates a a new instance of this class.
	 * 
	 * @param dataSource Source of user data.
	 */
	public UserDataService(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public List<UserModel> findAll() {
		String sql = "SELECT * FROM MulliganDB.user";
		List<UserModel> users = new ArrayList<UserModel>();
		try {
			// Executes the SQL query. Now we will loop through the results of that query.
			SqlRowSet srs = jdbcTemplateObject.queryForRowSet(sql);
			while (srs.next()) {
				users.add(new UserModel(srs.getInt("userId"), srs.getString("username"), srs.getString("password"),
						srs.getString("name"), srs.getString("email"), srs.getString("homeCourse"),
						srs.getDouble("handicapIndex")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public UserModel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel findByUsername(String username) {
		String sql = String.format("SELECT * FROM MulliganDB.user WHERE username='%s'", username);
		// Initializes product as empty model
		UserModel user = null;
		try {
			// Executes SQL query
			SqlRowSet srs = jdbcTemplateObject.queryForRowSet(sql);
			// Creates new product using results of query
			while (srs.next()) {
				user = new UserModel(srs.getInt("userId"), srs.getString("username"), srs.getString("password"),
						srs.getString("name"), srs.getString("email"), srs.getString("homeCourse"),
						srs.getDouble("handicapIndex"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return user;
	}

	@Override
	public boolean create(UserModel user) {
		//SQL statement to insert user to database
		String sql = "INSERT INTO MulliganDB.user (`username`, `password`, `name`, `email`, `homeCourse`, `handicapIndex`) VALUES (?, ?, ?, ?, ?, ?)";
		try {
			// Execute SQL Insert
			int rows = jdbcTemplateObject.update(sql, user.getUsername(),
					user.getPassword(), user.getName(), user.getEmail(),
					user.getHomeCourse(), user.getHandicapIndex());

			// Return result of Insert
			return rows == 1 ? true : false;
		} catch (Exception e) {
			e.printStackTrace();
		}
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
