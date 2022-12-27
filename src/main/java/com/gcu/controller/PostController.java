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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gcu.business.PostBusinessService;
import com.gcu.model.PostModel;

/**
 * @author paysonparker Post page controller.
 */
@Controller
@RequestMapping("/post")
public class PostController {

	/**
	 * Post business service
	 */
	@Autowired
	PostBusinessService service;

	/**
	 * Displays the post page.
	 * 
	 * @param model Model being passed to the view.
	 * @return the post page.
	 */
	@GetMapping("/")
	public String display(Model model) {
		model.addAttribute("postModel", new PostModel());
		return "post";
	}

	/**
	 * Makes a post upon the submission of the post form.
	 * @param postModel Post model being created.
	 * @param bindingResult Validates data input.
	 * @param model Model being passed to the view.
	 * @return the home page.
	 */
	@PostMapping("/makePost")
	public String makePost(@Valid PostModel postModel, BindingResult bindingResult, Model model) {
		// If post credentials are invalid, stay at post view
		if (bindingResult.hasErrors()) {
			return "post";
		}

		// If post credentials are valid, add post to db and return to main menu
		service.addPost(postModel);
		model.addAttribute("posts", service.getPosts());
		return "index";
	}

	/**
	 * Edits the post upon submission of the edit form.
	 * @param model  Model holding attributes.
	 * @param postId The ID number of the post being edited.
	 * @return the edit post page.
	 */
	@GetMapping("/editPost")
	public String editPost(Model model, @RequestParam(name = "id", required = true) Integer postId) {
		return "editPost";
	}

	/**
	 * Deletes a post upon the click of the delete button.
	 * @param model  Model holding attributes.
	 * @param postId The ID number of the post being deleted.
	 * @return the home page.
	 */
	@GetMapping("/delete")
	public String delete(Model model, @RequestParam(name = "id", required = true) Integer postId) {
		// Deletes post
		service.delete(service.getPostById(postId));

		// Gets updated post list
		model.addAttribute("posts", service.getPosts());
		return "index";
	}
}
