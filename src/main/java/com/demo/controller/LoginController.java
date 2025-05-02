package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.MyUser;
import com.demo.service.LoginService;

@Controller
@RequestMapping("/security")
public class LoginController {

	@Autowired
	LoginService lservice;

	@GetMapping("/login")
	public String showlogin() {
		return "loginpage";
	}

	@PostMapping("/validate")
	public ModelAndView authenticateuser(@RequestParam("uname") String unm, @RequestParam("password") String pass,
			HttpSession session) {

		MyUser user = lservice.findUser(unm, pass);
		System.out.println(user);
		if(user != null && (user.getUsername().equals(unm)) && user.getPassword().equals(pass)) {
			session.setAttribute("user", user);
			return new ModelAndView("redirect:/contacts/getcontacts");
		} else {
			return new ModelAndView("loginpage", "msg", "Wrong Credentials pls Login Again");
		}

	}

}
