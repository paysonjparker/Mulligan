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
import com.gcu.model.UserModel;

/**
 * @author paysonparker
 *
 */
@Controller
public class HomeController {

	@Autowired
	PostBusinessService service;

	@GetMapping("/")
	public String display(Model model) {

		model.addAttribute("posts", service.getPosts());
		
		return "index";
	}
	
	@PostMapping("/doSearch")
	public String doSearch(@Valid PostModel postModel, BindingResult bindingResult, Model model) {
		// If post credentials are invalid, stay at post view
		if (bindingResult.hasErrors()) {
			return "post";
		}
		
		// If register credentials are valid, add post to db and return to main menu
		model.addAttribute("posts", service.getPosts());
		return "index";
	}
}
