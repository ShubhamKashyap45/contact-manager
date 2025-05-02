package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@GetMapping("/")
	public String welcomepage() {
		return "index";
	}
	
	@GetMapping("/message")
	public ModelAndView getMessage() {
		String message="this is message from getMessagefunction";
		return new ModelAndView("showmessage", "msg", message);
	}

}
