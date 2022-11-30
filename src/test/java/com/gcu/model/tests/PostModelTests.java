/**
 * 
 */
package com.gcu.model.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.gcu.model.PostModel;

/**
 * @author paysonparker
 *
 */
class PostModelTests {

	private PostModel testPost = new PostModel(1, "content", "time", "author");

	/**
	 * Test method for
	 * {@link com.gcu.model.PostModel#PostModel(int, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	void testPostModelIntStringStringString() {
		PostModel testPostConstruct = new PostModel(2, "post", "the time", "the author");
		assertEquals(2, testPostConstruct.getPostId());
		assertEquals("post", testPostConstruct.getContent());
		assertEquals("the time", testPostConstruct.getPostTime());
		assertEquals("the author", testPostConstruct.getAuthor());
	}

	/**
	 * Test method for {@link com.gcu.model.PostModel#getPostId()}.
	 */
	@Test
	void testGetPostId() {
		assertEquals(1, testPost.getPostId());
	}

	/**
	 * Test method for {@link com.gcu.model.PostModel#setPostId(int)}.
	 */
	@Test
	void testSetPostId() {
		testPost.setPostId(2);
		assertEquals(2, testPost.getPostId());
	}

	/**
	 * Test method for {@link com.gcu.model.PostModel#getContent()}.
	 */
	@Test
	void testGetContent() {
		assertEquals("content", testPost.getContent());
	}

	/**
	 * Test method for {@link com.gcu.model.PostModel#setContent(java.lang.String)}.
	 */
	@Test
	void testSetContent() {
		testPost.setContent("new content");
		assertEquals("new content", testPost.getContent());
	}

	/**
	 * Test method for {@link com.gcu.model.PostModel#getPostTime()}.
	 */
	@Test
	void testGetPostTime() {
		assertEquals("time", testPost.getPostTime());
	}

	/**
	 * Test method for
	 * {@link com.gcu.model.PostModel#setPostTime(java.lang.String)}.
	 */
	@Test
	void testSetPostTime() {
		testPost.setPostTime("new time");
		assertEquals("new time", testPost.getPostTime());
		testPost.setPostTime("2022-10-26 16:39:16");
		assertEquals("16:39 P.M.", testPost.getPostTime());
		testPost.setPostTime("2022-10-28 11:03:47");
		assertEquals("11:03 A.M.", testPost.getPostTime());
	}

	/**
	 * Test method for {@link com.gcu.model.PostModel#getAuthor()}.
	 */
	@Test
	void testGetAuthor() {
		assertEquals("author", testPost.getAuthor());
	}

	/**
	 * Test method for {@link com.gcu.model.PostModel#setAuthor(java.lang.String)}.
	 */
	@Test
	void testSetAuthor() {
		testPost.setAuthor("new author");
		assertEquals("new author", testPost.getAuthor());
	}

}
