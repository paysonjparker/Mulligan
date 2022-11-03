/**
 * 
 */
package com.gcu.data;

import java.util.List;

/**
 * @author paysonparker
 * 
 * @param <T> Anonymous data type. Could be either UserModel or PostModel.
 */
public interface DataAccessInterface <T> {

	/**
	 * Finds all entities.
	 * @return all found entities.
	 */
	public List<T> findAll();
	
	/**
	 * Finds an entity by ID number.
	 * @param id ID number being searched for.
	 * @return The entity found.
	 */
	public T findById(int id);
	
	/**
	 * Finds an entity by user name.
	 * @param username User name being searched for.
	 * @return The entity found.
	 */
	public T findByUsername(String username);
	
	/**
	 * Creates a new entity.
	 * @param t The entity being created.
	 * @return If the entity was successfully created.
	 */
	public boolean create(T t);
	
	/**
	 * Updates an existing entity.
	 * @param t The entity being updated.
	 * @return If the entity was successfully updated.
	 */
	public boolean update(T t);
	
	/**
	 * Deletes an existing entity.
	 * @param t The entity being deleted.
	 * @return If the entity was successfully deleted.
	 */
	public boolean delete(T t);
}