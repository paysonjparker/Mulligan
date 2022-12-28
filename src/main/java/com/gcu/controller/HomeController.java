/**
 * 
 */
package com.gcu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gcu.business.PostBusinessService;

/**
 * @author paysonparker
 * Home page controller.
 */
@Controller
public class HomeController {

	/**
	 * Post business service.
	 */
	@Autowired
	PostBusinessService postBusinessService; //post business service for accessing post data layer.

	/**
	 * Displays home page.
	 * @param model Model being passed to the view.
	 * @return the home page.
	 */
	@GetMapping("/")
	public String display(Model model) {

		model.addAttribute("posts", postBusinessService.getPosts()); //gets all posts so they can be displayed on home page.
		
		return "index";
	}
	
	/**
	 * Executes a search for a specified string in each post.
	 * @param search The string being searched for.
	 * @param model Model being passed to the view.
	 * @return the home page, displaying all the posts found that contain the search term.
	 */
	@PostMapping("/doSearch")
	public String doSearch(String search, Model model) {
		
		// if search is successful return the found posts.
		model.addAttribute("posts", postBusinessService.search(search));
		return "index";
	}
}
