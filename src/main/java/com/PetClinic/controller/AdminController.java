package com.PetClinic.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminController {

	@GetMapping(value = {"/home"})
	public String landingPageHandler(Principal principal) 
	{
		return "homePage";
	}
	
}
