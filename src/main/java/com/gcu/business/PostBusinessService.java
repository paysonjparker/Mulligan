/**
 * 
 */
package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.data.DataAccessInterface;
import com.gcu.model.PostModel;

/**
 * @author paysonparker
 * Post Business service class.
 */
@Service
public class PostBusinessService {

	@Autowired
	DataAccessInterface<PostModel> postDataService; //implemented data access interface with PostModel data type
	
	/**
	 * Returns all posts from database
	 * @return list of post
	 */
	public List<PostModel> getPosts()
	{
		return postDataService.findAll(); //gets all existing posts from database
	}
	
	/**
	 * Gets a post by its ID number.
	 * @param id Id being searched for.
	 * @return The post with that ID number if it exists.
	 */
	public PostModel getPostById(int id)
	{
		return postDataService.findById(id); //finds a single post associated with the given ID number
	}
	
	/**
	 * Adds a post to the database.
	 * @param post Post model being created.
	 */
	public void addPost(PostModel post)
	{
		postDataService.create(post); //creates a new postModel object and adds it to the database
	}

	/**
	 * Updates a post's variables.
	 * @param post Post being edited.
	 */
	public void update(PostModel post) 
	{
		postDataService.update(post); //Updates a specified post 
	}

	/**
	 * Deletes a post from the database.
	 * @param post Post model being deleted.
	 */
	public void delete(PostModel post) 
	{
		postDataService.delete(post); //deletes a specified post
	}
	
	public List<PostModel> search(String searchContent){
		return postDataService.search(searchContent); //searches for a specific string with post content and returns a list of all posts containing that string
	}
}
