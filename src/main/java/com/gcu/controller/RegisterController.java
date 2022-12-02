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

import com.gcu.business.PostBusinessService;
import com.gcu.business.UserBusinessService;
import com.gcu.model.UserModel;

/**
 * @author paysonparker
 *
 */
@Controller
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	UserBusinessService userService;
	
	@Autowired
	PostBusinessService postService;

	@GetMapping("/")
	public String display(Model model) {

		// display the register page.
		model.addAttribute("userModel", new UserModel());
		return "register";
	}

	@PostMapping("/doRegister")
	public String doRegister(@Valid UserModel userModel, BindingResult bindingResult, Model model) {
		// If register credentials are invalid, stay at register view
		if (bindingResult.hasErrors()) {
			return "register";
		}

		// If register credentials are valid, add user to db and return to main menu
		userService.addUser(userModel);

		// Returns empty product list
		model.addAttribute("posts", postService.getPosts());

		// Returns main menu view
		return "index";
	}
}
