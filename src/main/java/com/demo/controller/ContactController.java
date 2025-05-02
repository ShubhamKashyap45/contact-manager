package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Contacts;
import com.demo.service.ContactService;

@Controller
@RequestMapping("/contacts")
public class ContactController {
	
	@Autowired
	ContactService cservice;
	
	@GetMapping("/getcontacts")
	public ModelAndView getAllContacts() {
		List<Contacts> clist = cservice.getAllContacts();
		return new ModelAndView("contactlist", "clist", clist);
		
	}
	
	@GetMapping("/addnewcontact")
	public String displayForm(Model model) {
		model.addAttribute("c1", new Contacts());
		return "addcontact";
	}
	
	@PostMapping("/insertcontact")
	public ModelAndView insertcontact(@ModelAttribute Contacts c) {
		boolean status = cservice.addNewContact(c);
		if(status) {
			return new ModelAndView("redirect:/contacts/getcontacts");
		} else {
			return new ModelAndView("redirect:/contacts/getcontacts", "msg", "Add Contact Failed");
		}
	}

}
