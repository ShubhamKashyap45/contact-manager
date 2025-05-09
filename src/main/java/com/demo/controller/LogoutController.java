package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/logout")
public class LogoutController {
	
	@GetMapping("/userlogout")
	public String logoutUser(HttpSession session) {
		session.invalidate();
		return "redirect:/security/login";
	}
	
	@GetMapping("/adminlogout")
	public String logoutAdmin(HttpSession session) {
		session.invalidate();
		return "redirect:/security/login";
	}
}
