package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("/edituser/{uid}")
	public ModelAndView editUser(@PathVariable int uid) {
		MyUser u = aservice.getById(uid);
		if(u != null) {
			return new ModelAndView("edituser", "user", u);
		} else {
			return new ModelAndView("redirect:/admin/dashboard");
		}
	}
	
	@PostMapping("/updateuser")
	public ModelAndView updateUser(@ModelAttribute MyUser u) {
		boolean status = aservice.updateUser(u);
		ModelAndView user_updated = new ModelAndView("redirect:/admin/dashboard");
		ModelAndView failed = new ModelAndView("redirect:/admin/dashboard", "msg", "Update User Failed");
		return status? user_updated : failed;
	}
	
	@GetMapping("/deleteuser/{uid}")
	public ModelAndView deleteUser(@PathVariable int uid) {
		boolean status = aservice.deleteById(uid);
		if(status) {
			return new ModelAndView("redirect:/admin/dashboard");
		} else {
			return new ModelAndView("redirect:/admin/dashboard", "msg", "Delete User Failed");
		}
	}
}
