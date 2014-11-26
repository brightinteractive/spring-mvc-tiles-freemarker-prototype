package com.brightinteractive.smtfp;

/*
 * Copyright 2014 Bright Interactive, All Rights Reserved.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController
{
	@RequestMapping("/home.htm")
	public String home()
	{
		System.out.println("INSIDE HOME");
		return "home";
	}

	@RequestMapping("/page.htm")
	public String page(@RequestParam(value = "pageNo") String pageNo, Model model)
	{
		System.out.println("PageNo: " + pageNo);
		model.addAttribute("pageNo", pageNo);
		return "page";
	}
}
