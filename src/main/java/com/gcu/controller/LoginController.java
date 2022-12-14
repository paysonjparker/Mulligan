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
 * Login page controller.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

	/**
	 * User business service.
	 */
	@Autowired
	UserBusinessService userBusinessService;
	
	/**
	 * Post business service.
	 */
	@Autowired
	PostBusinessService postBusinessService;
	
	/**
	 * Displays login page.
	 * @param model Model being passed to the view.
	 * @return The login page.
	 */
	@GetMapping("/")
	public String display(Model model) {
		
		model.addAttribute("userModel", new UserModel());
		return "login";
	}
	
	/**
	 * Executes a user login.
	 * @param userModel User logging in.
	 * @param bindingResult Checks for errors in login input.
	 * @param model Model being passed to the view.
	 * @return The login page if unsuccessful or the home page if successful.
	 */
	@PostMapping("/doLogin")
	public String doLogin(@Valid UserModel userModel, BindingResult bindingResult, Model model) {
		// If login credentials are invalid, stay at login
		if (bindingResult.hasErrors()) {
			return "login";
		}
		
		// Returns the product list
		model.addAttribute("posts", postBusinessService.getPosts());

		// Returns main menu view
		return "redirect:/";
	}
}
