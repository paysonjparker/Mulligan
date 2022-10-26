/**
 * 
 */
package com.gcu.model;

/**
 * @author paysonparker
 *
 */
public class PostModel {

	private int postId;
	private String content;
	private String postTime;
	private UserModel author;
	
	/**
	 * @param postId Post's unique ID number.
	 * @param content Post's content.
	 * @param postTime The date and time of the post.
	 * @param author The author of the post.
	 */
	public PostModel(int postId, String content, String postTime, UserModel author) {
		this.postId = postId;
		this.content = content;
		this.postTime = postTime;
		this.author = author;
	}

	/**
	 * @return the postId
	 */
	public int getPostId() {
		return postId;
	}

	/**
	 * @param postId the postId to set
	 */
	public void setPostId(int postId) {
		this.postId = postId;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the postTime
	 */
	public String getPostTime() {
		return postTime;
	}

	/**
	 * @param postTime the postTime to set
	 */
	public void setPostTime(String postTime) {
		this.postTime = postTime;
	}

	/**
	 * @return the author
	 */
	public UserModel getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(UserModel author) {
		this.author = author;
	}
	
	
	
}
