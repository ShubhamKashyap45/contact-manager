package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.MyUser;
import com.demo.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService aservice;
	
	@GetMapping("/dashboard")
	public ModelAndView adminPage(HttpSession session) {
		MyUser loggedInAdmin = (MyUser) session.getAttribute("user");
		if(loggedInAdmin == null) {
			return new ModelAndView("redirect/security/login");
		}
		List<MyUser> ulist = aservice.getAllUsers();
		return new ModelAndView("userlist", "ulist", ulist);
	}

}
