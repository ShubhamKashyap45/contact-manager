package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.demo.beans.MyUser;
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
	public String registerUser(@ModelAttribute UserDetails ud, 
			@RequestParam("username") String username,
			@RequestParam("password") String password,
			RedirectAttributes redirectAttributes) {
		
		MyUser user = new MyUser();
		user.setUsername(username);
		user.setPassword(password);
		user.setRole("user");
		
		boolean status = rservice.addNewUser(ud, user);
		String msg = status ? "Registration Done, Login Again" : "Registration Failed, Login Again";
	    redirectAttributes.addFlashAttribute("msg", msg);
	    return "redirect:/security/login";
	}

}
