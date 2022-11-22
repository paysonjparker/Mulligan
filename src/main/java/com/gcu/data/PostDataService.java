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

import com.gcu.model.PostModel;

/**
 * @author paysonparker
 *
 */
@Service
public class PostDataService implements DataAccessInterface<PostModel> {

	@Autowired
	@SuppressWarnings("unused")
	private DataSource dataSource;

	private JdbcTemplate jdbcTemplateObject;

	/**
	 * @param dataSource
	 */
	public PostDataService(DataSource dataSource) {

		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public List<PostModel> findAll() {

		String sql = "SELECT * FROM MulliganDB.post";
		List<PostModel> posts = new ArrayList<PostModel>();
		try {
			// Executes SQL query
			SqlRowSet srs = jdbcTemplateObject.queryForRowSet(sql);
			// Loops through results of query
			while (srs.next()) {
				posts.add(new PostModel(srs.getInt("postId"), srs.getString("content"), srs.getString("postTime"),
						srs.getString("author")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return posts;
	}

	@Override
	public PostModel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostModel findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(PostModel post) {
		//SQL statement to insert user to database
				String sql = "INSERT INTO MulliganDB.post (`content`, `author`) VALUES (?, ?)";
				try {
					// Execute SQL Insert
					int rows = jdbcTemplateObject.update(sql, post.getContent(),
							post.getAuthor());

					// Return result of Insert
					return rows == 1 ? true : false;
				} catch (Exception e) {
					e.printStackTrace();
				}
				return false;
	}

	@Override
	public boolean update(PostModel t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(PostModel post) {
		String sql = "DELETE FROM MulliganDB.post WHERE postId=" + post.getPostId();
		try
		{
		   // Execute SQL
			jdbcTemplateObject.execute(sql);
			return true;
		}
		catch (Exception e)
		{
		    e.printStackTrace();
		}
		return false;
	}

}
