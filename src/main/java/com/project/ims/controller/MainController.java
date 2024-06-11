package com.project.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/login")
	public String login() {
		// return "login";
		return "login";
	}

	@GetMapping("/")
	public String home() {
		return "products";
	}
	

}
