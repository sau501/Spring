package com.first.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Objects;

@Controller
@SessionAttributes("name")
public class WelcomeController {
	@GetMapping("/")
	public String login() {
//		model.addAttribute("name",getUsername());
		return "login";
	}

	@PostMapping("/")
	public String welcome(@RequestParam String name,
						  @RequestParam String password, Model model){
		model.addAttribute("name",name);
		if(name.equals("saurabh") && password.equals("saurabh")){
			return "welcome";
		}
		return "redirect:/";
	}

	@GetMapping("welcome")
	public String welcome(){
		return "welcome";
	}

//	public String getUsername(){
//		Authentication authentication = SecurityContextHolder.getContext()
//				.getAuthentication();
//		return authentication.getName();
//	}

}
