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
	DataAccessInterface<PostModel> service; //implemented data access interface with PostModel data type
	
	/**
	 * Returns all posts from database
	 * @return list of post
	 */
	public List<PostModel> getPosts()
	{
		return service.findAll();
	}
	
	/**
	 * Gets a post by its ID number.
	 * @param id Id being searched for.
	 * @return The post with that ID number if it exists.
	 */
	public PostModel getPostById(int id)
	{
		return service.findById(id);
	}
	
	/**
	 * Adds a post to the database.
	 * @param post Post model being created.
	 */
	public void addPost(PostModel post)
	{
		service.create(post);
	}

	/**
	 * Updates a post's variables.
	 * @param post Post being edited.
	 */
	public void update(PostModel post) 
	{
		service.update(post);
	}

	/**
	 * Deletes a post from the database.
	 * @param post Post model being deleted.
	 */
	public void delete(PostModel post) 
	{
		service.delete(post);
	}
}
