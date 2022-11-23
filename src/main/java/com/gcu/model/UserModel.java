
package com.gcu.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author paysonparker
 * UserModel class to model a user account in the application.
 */
public class UserModel {

	private int userId;
	@NotNull(message="Username is a required field")
	@NotEmpty(message="Username is a required field")
	@Size(min=2, max=36, message="Username must be between 2-36 characters")
	private String username;
	@NotNull(message="Password is a required field")
	@NotEmpty(message="Password is a required field")
	@Size(min=2, max=254, message="Password must be between 2-254 characters")
	private String password;
	@NotNull(message="Name is a required field")
	@NotEmpty(message="Name is a required field")
	@Size(min=2, max=72, message="Name must be between 2-72 characters")
	private String name;
	@NotNull(message="Email is a required field")
	@NotEmpty(message="Email is a required field")
	@Email(message="Please provide a valid email address")
	private String email;
	@NotNull(message="Home course is a required field")
	@NotEmpty(message="Home course is a required field")
	@Size(min=6, max=254, message="Home course name must be between 6-36 characters")
	private String homeCourse;
	@NotNull(message="Handicap index is a required field")
	private double handicapIndex;
	
	/**
	 * @param userId User's unique ID number.
	 * @param username User's user name.
	 * @param password User's password.
	 * @param name User's full name.
	 * @param email User's email address.
	 * @param homeCourse User's home course.
	 * @param handicapIndex User's handicap index.
	 */
	public UserModel(int userId, String username, String password, String name, String email, String homeCourse,
			double handicapIndex) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.homeCourse = homeCourse;
		this.handicapIndex = handicapIndex;
	}
	
	/**
	 * Default constructor
	 */
	public UserModel() {
		
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the homeCourse
	 */
	public String getHomeCourse() {
		return homeCourse;
	}

	/**
	 * @param homeCourse the homeCourse to set
	 */
	public void setHomeCourse(String homeCourse) {
		this.homeCourse = homeCourse;
	}

	/**
	 * @return the handicapIndex
	 */
	public double getHandicapIndex() {
		return handicapIndex;
	}

	/**
	 * @param handicapIndex the handicapIndex to set
	 */
	public void setHandicapIndex(double handicapIndex) {
		this.handicapIndex = handicapIndex;
	}
	
	
	
}
