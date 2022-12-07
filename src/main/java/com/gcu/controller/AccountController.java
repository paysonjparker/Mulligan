/**
 * 
 */
package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author paysonparker
 * Account page controller.
 */
@Controller
public class AccountController {

	/**
	 * Displays the account page.
	 * @param model Model being passed to view.
	 * @return Account page.
	 */
	@GetMapping("/account")
	public String display(Model model) {
		return "account";
	}
	
	/**
	 * Displays the edit User page and executes the edit user.
	 * @param model Model being passed to view.
	 * @param postId The ID number of the post being edited.
	 * @return The edit user page.
	 */
	@GetMapping("/editUser")
	public String editUser(Model model, @RequestParam(name="id", required = true) Integer postId) 
	{
		return "editUser";
	}
}
