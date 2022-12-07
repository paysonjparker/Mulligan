/**
 * 
 */
package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author paysonparker
 * Login page controller.
 */
@Controller
public class LoginController {

	/**
	 * Displays login page.
	 * @param model Model being passed to the view.
	 * @return The login page.
	 */
	@GetMapping("/login")
	public String display(Model model) {
		return "login";
	}
}
