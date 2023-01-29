package com.example.BookStore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller

public class BookStoreController {	
	@RequestMapping("/index")
	public String greeting( Model model) {
	
	return "index";
	}
	}