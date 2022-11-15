/**
 * 
 */
package com.gcu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gcu.business.PostBusinessService;

/**
 * @author paysonparker
 *
 */
@Controller
public class HomeController {

	@Autowired
	PostBusinessService productBusinessService;

	@GetMapping("/")
	public String display(Model model) {

//		model.addAttribute("posts", productBusinessService.getPosts());
		
		return "index";
	}
}
