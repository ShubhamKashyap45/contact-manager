package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("editcontact/{cid}")
	public ModelAndView editContact(@PathVariable int cid) {
		Contacts c = cservice.getById(cid);
		if(c!=null) {
			return new ModelAndView("editcontact", "cont", c);
		} else {
			return new ModelAndView("redirect:/contacts/getcontacts");
		}
	}
	
	@PostMapping("/updatecontact")
	public ModelAndView updateContact(@RequestParam int cid, @RequestParam Long phoneno, @RequestParam String email) {
		Contacts c = new Contacts(cid, phoneno, email);
		boolean status = cservice.updateContact(c);
		if(status) {
			return new ModelAndView("redirect:/contacts/getcontacts");
		} else {
			return new ModelAndView("redirect:/contacts/getcontacts", "msg", "Update Contact Failed");
		}
	}
	
	@GetMapping("deletecontact/{cid}")
	public ModelAndView deleteContact(@PathVariable int cid) {
		boolean status = cservice.deleteById(cid);
		if(status) {
			return new ModelAndView("redirect:/contacts/getcontacts");
		} else {
			return new ModelAndView("redirect:/contacts/getcontacts", "msg", "Delete Contact Failed");
		}
		
	}

}
