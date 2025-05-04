package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.UserDetails;
import com.demo.service.RegisterService;

@Controller
@RequestMapping("/registeration")
public class RegisterController {
	
	@Autowired
	RegisterService rservice;
	
	@GetMapping("/register")
	public String registerationForm() {
		return "registerationform";
	}
	
	@PostMapping("/registeruser")
	public ModelAndView registerUser(@ModelAttribute UserDetails ud) {
		boolean status = rservice.addNewUser(ud);
	    return new ModelAndView("redirect:/security/login", "msg", status ? "Registration Done, Login Again" : "Registration Failed, Login Again");
	}

}
