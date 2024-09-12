package com.profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.profile.entities.Post;

@Controller
public class NavigationController {
	@GetMapping()
	public String index(){
		return "index.html";
	}
	
	@GetMapping("/openSignUp")
	public String openSingnUp() {
		return "signUp.html";
	}
	
	@GetMapping("/openCreatePost")
	public String openCreatePost() {
		return "createPost.html";
	}
	
}

