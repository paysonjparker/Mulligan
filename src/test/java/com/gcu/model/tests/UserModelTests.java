/**
 * 
 */
package com.gcu.model.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.gcu.model.UserModel;

/**
 * @author paysonparker
 *
 */
class UserModelTests {

	private UserModel testUser = new UserModel(1, "username", "password", "name", "email@email.com", "homeCourse",
			10.0);

	/**
	 * Test method for
	 * {@link com.gcu.model.UserModel#UserModel(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double)}.
	 */
	@Test
	void testUserModelIntStringStringStringStringStringDouble() {
		UserModel testUserConstruct = new UserModel(2, "userConst", "passConst", "nameConst", "email@email.com",
				"courseConst", 11.1);
		assertEquals(2, testUserConstruct.getUserId());
		assertEquals("userConst", testUserConstruct.getUsername());
		assertEquals("passConst", testUserConstruct.getPassword());
		assertEquals("nameConst", testUserConstruct.getName());
		assertEquals("email@email.com", testUserConstruct.getEmail());
		assertEquals("courseConst", testUserConstruct.getHomeCourse());
		assertEquals(11.1, testUserConstruct.getHandicapIndex());
	}

	/**
	 * Test method for {@link com.gcu.model.UserModel#getUserId()}.
	 */
	@Test
	void testGetUserId() {
		assertEquals(1, testUser.getUserId());
	}

	/**
	 * Test method for {@link com.gcu.model.UserModel#setUserId(int)}.
	 */
	@Test
	void testSetUserId() {
		testUser.setUserId(3);
		assertEquals(3, testUser.getUserId());
	}

	/**
	 * Test method for {@link com.gcu.model.UserModel#getUsername()}.
	 */
	@Test
	void testGetUsername() {
		assertEquals("username", testUser.getUsername());
	}

	/**
	 * Test method for
	 * {@link com.gcu.model.UserModel#setUsername(java.lang.String)}.
	 */
	@Test
	void testSetUsername() {
		testUser.setUsername("newUser");
		assertEquals("newUser", testUser.getUsername());
	}

	/**
	 * Test method for {@link com.gcu.model.UserModel#getPassword()}.
	 */
	@Test
	void testGetPassword() {
		assertEquals("password", testUser.getPassword());
	}

	/**
	 * Test method for
	 * {@link com.gcu.model.UserModel#setPassword(java.lang.String)}.
	 */
	@Test
	void testSetPassword() {
		testUser.setPassword("newPass");
		assertEquals("newPass", testUser.getPassword());
	}

	/**
	 * Test method for {@link com.gcu.model.UserModel#getName()}.
	 */
	@Test
	void testGetName() {
		assertEquals("name", testUser.getName());

	}

	/**
	 * Test method for {@link com.gcu.model.UserModel#setName(java.lang.String)}.
	 */
	@Test
	void testSetName() {
		testUser.setName("newName");
		assertEquals("newName", testUser.getName());
	}

	/**
	 * Test method for {@link com.gcu.model.UserModel#getEmail()}.
	 */
	@Test
	void testGetEmail() {
		assertEquals("email@email.com", testUser.getEmail());
	}

	/**
	 * Test method for {@link com.gcu.model.UserModel#setEmail(java.lang.String)}.
	 */
	@Test
	void testSetEmail() {
		testUser.setEmail("newEmail@email.com");
		assertEquals("newEmail@email.com", testUser.getEmail());
	}

	/**
	 * Test method for {@link com.gcu.model.UserModel#getHomeCourse()}.
	 */
	@Test
	void testGetHomeCourse() {
		assertEquals("homeCourse", testUser.getHomeCourse());
	}

	/**
	 * Test method for
	 * {@link com.gcu.model.UserModel#setHomeCourse(java.lang.String)}.
	 */
	@Test
	void testSetHomeCourse() {
		testUser.setHomeCourse("newCourse");
		assertEquals("newCourse", testUser.getHomeCourse());
	}

	/**
	 * Test method for {@link com.gcu.model.UserModel#getHandicapIndex()}.
	 */
	@Test
	void testGetHandicapIndex() {
		assertEquals(10.0, testUser.getHandicapIndex());
	}

	/**
	 * Test method for {@link com.gcu.model.UserModel#setHandicapIndex(double)}.
	 */
	@Test
	void testSetHandicapIndex() {
		testUser.setHandicapIndex(5.4);
		assertEquals(5.4, testUser.getHandicapIndex());
	}

}
