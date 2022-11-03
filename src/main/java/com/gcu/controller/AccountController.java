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
 *
 */
@Controller
public class AccountController {

	@GetMapping("/account")
	public String display(Model model) {
		return "account";
	}
	
	@GetMapping("/editUser")
	public String editUser(Model model, @RequestParam(name="id", required = true) Integer postId) 
	{
		return "editUser";
	}
}
