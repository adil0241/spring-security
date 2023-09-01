package com.spring.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hcontroller 
{
	@RequestMapping("/")
	public String home() 
	{
		return"home.jsp";
	}
}
