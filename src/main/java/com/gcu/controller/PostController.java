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
public class PostController {

	@GetMapping("/post")
	public String display(Model model) {
		return "post";
	}
}
