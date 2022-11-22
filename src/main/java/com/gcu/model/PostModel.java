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
	private String author;
	
	/**
	 * @param postId Post's unique ID number.
	 * @param content Post's content.
	 * @param postTime The date and time of the post.
	 * @param author The author of the post.
	 */
	public PostModel(int postId, String content, String postTime, String author) {
		this.postId = postId;
		this.content = content;
		this.postTime = postTime;
		this.author = author;
	}
	
	public PostModel() {
		
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
		String tempDate = "";
		tempDate+= postTime.substring(0, 10); //post date
		tempDate+= " - ";
		tempDate+= postTime.substring(11,16); //time numbers
		if(postTime.substring(11).compareTo("12") > 0) { //if past noon
			tempDate+=" P.M."; //pm time
		} else {
			tempDate+=" A.M."; //am time
		}
		return tempDate;
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
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
