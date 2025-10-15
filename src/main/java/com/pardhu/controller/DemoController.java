package com.pardhu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pardhu")
public class DemoController 
{
	@GetMapping("/")
	public String home()
	{
		return "WELCOME TO BACKEND JENKINS APP";
	}
	
	@GetMapping("/name")
	public String name()
	{
		return "B Pardha Saradhi";
	}
	
	@GetMapping("/age")
	public String age()
	{
		return "19";
	}
	
	@GetMapping("/branch")
	public String branch()
	{
		return "Computer Science and Engineering";
	}
}
