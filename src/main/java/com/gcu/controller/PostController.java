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
import org.springframework.web.bind.annotation.RequestParam;

import com.gcu.model.PostModel;

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
	
	@PostMapping("/makePost")
	public String makePost(@Valid PostModel postModel, BindingResult bindingResult, Model model)
	{
			return "index";
	}
	
	@GetMapping("/editPost")
	public String editPost(Model model, @RequestParam(name="id", required = true) Integer postId) 
	{
		return "editPost";
	}
	
	@GetMapping("/delete")
	public String delete(Model model, @RequestParam(name="id", required = true) Integer postId) 
	{
		return "index";
	}
}
