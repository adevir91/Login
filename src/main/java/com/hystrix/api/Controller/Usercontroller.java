package com.hystrix.api.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Usercontroller {
	
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}

}
