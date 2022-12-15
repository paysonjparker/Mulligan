/**
 * 
 */
package com.gcu.controller;

import javax.validation.Valid; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gcu.business.PostBusinessService;
import com.gcu.model.PostModel;

/**
 * @author paysonparker
 * Home page controller.
 */
@Controller
public class HomeController {

	@Autowired
	PostBusinessService service; //post business service for accessing post data layer.

	/**
	 * Displays home page.
	 * @param model Model being passed to the view.
	 * @return the home page.
	 */
	@GetMapping("/")
	public String display(Model model) {

		model.addAttribute("posts", service.getPosts()); //gets all posts so they can be displayed on home page.
		
		return "index";
	}
	
	/**
	 * Executes the seach method.
	 * @param postModel PostModel being searched for.
	 * @param bindingResult Checks for errors in search input.
	 * @param model Model being passed to the view.
	 * @return The home page.
	 */
	@PostMapping("/doSearch")
	public String doSearch(@Valid PostModel postModel, BindingResult bindingResult, Model model) {
		// If post credentials are invalid, stay at post view
		if (bindingResult.hasErrors()) {
			return "post";
		}
		
		// if search is successful return the found posts.
		model.addAttribute("posts", service.getPosts());
		return "index";
	}
}
