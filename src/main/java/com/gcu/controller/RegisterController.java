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
 * Register page controller.
 */
@Controller
@RequestMapping("/register")
public class RegisterController {

	/**
	 * User business service.
	 */
	@Autowired
	UserBusinessService userService;
	
	/**
	 * Post business service.
	 */
	@Autowired
	PostBusinessService postService;

	/**
	 * Displays the register page.
	 * @param model Model being passed to the view.
	 * @return The home page.
	 */
	@GetMapping("/")
	public String display(Model model) {

		model.addAttribute("userModel", new UserModel());
		return "register";
	}

	/**
	 * Executes a user register into the database.
	 * @param userModel User Model being created.
	 * @param bindingResult Used for checking input errors.
	 * @param model Model being passed to the view.
	 * @return the home page after a user is registered.
	 */
	@PostMapping("/doRegister")
	public String doRegister(@Valid UserModel userModel, BindingResult bindingResult, Model model) {
		// If register credentials are invalid, stay at register view
		if (bindingResult.hasErrors()) {
			return "register";
		}

		// If register credentials are valid, add user to database and return to main menu
		userService.addUser(userModel);

		// Returns the product list
		model.addAttribute("posts", postService.getPosts());

		// Returns main menu view
		return "redirect:/";
	}
}
