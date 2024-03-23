package com.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	
	@GetMapping("/welcome")
	public String welcome(Model model)
	{
		model.addAttribute("message", "This Welcome page");
		return "welcome";
	}

}
