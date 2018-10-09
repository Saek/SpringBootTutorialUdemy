package com.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AlienController {

	@RequestMapping("/")
	public String home() {
		System.out.println("test11");
//		return "newh.html";
		return "home.jsp";
//		return "dddddd";
	}
}
