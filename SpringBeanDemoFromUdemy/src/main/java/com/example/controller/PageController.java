package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.NotificationService;

@RestController
public class PageController {

	private NotificationService notificationService;
	
	@Autowired
	public PageController(NotificationService notificationService) {
		this.notificationService = notificationService;
	}
	
	@RequestMapping("/")
	public String home() {
		System.out.println("notificationService:" + notificationService);
		return notificationService.toString();
	}
	
}
