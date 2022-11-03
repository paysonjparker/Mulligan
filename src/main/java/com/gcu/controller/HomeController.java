/**
 * 
 */
package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author paysonparker
 *
 */
@Controller
public class HomeController {

	@GetMapping("/")
	public String display(Model model) {
		return "index";
	}
}