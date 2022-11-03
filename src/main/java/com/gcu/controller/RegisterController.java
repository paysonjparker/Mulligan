/**
 * 
 */
package com.gcu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.model.UserModel;

/**
 * @author paysonparker
 *
 */
@Controller
public class RegisterController {
	
	@GetMapping("/register")
	public String display(Model model) {
		return "register";
	}
	
	@PostMapping("/doRegister")
	public String doRegister(@Valid UserModel userModel, BindingResult bindingResult, Model model)
	{
		return "index";
	}
}
