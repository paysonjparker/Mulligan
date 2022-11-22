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
 * @author paysonparker
 *
 */
@Controller
@RequestMapping("/post")
public class PostController {

	@Autowired
	PostBusinessService service;

	@GetMapping("/")
	public String display(Model model) {
		// display the register page.
		model.addAttribute("postModel", new PostModel());
		return "post";
	}

	@PostMapping("/makePost")
	public String makePost(@Valid PostModel postModel, BindingResult bindingResult, Model model) {
		// If post credentials are invalid, stay at post view
		if (bindingResult.hasErrors()) {
			return "register";
		}

		// If register credentials are valid, add post to db and return to main menu
		service.addPost(postModel);
		return "post";
	}

	@GetMapping("/editPost")
	public String editPost(Model model, @RequestParam(name = "id", required = true) Integer postId) {
		return "editPost";
	}

	@GetMapping("/delete")
	public String delete(Model model, @RequestParam(name = "id", required = true) Integer postId) {
		// Deletes post
		service.delete(service.getPostById(postId));

		// Gets updated post list
		model.addAttribute("posts", service.getPosts());
		return "index";
	}
}
