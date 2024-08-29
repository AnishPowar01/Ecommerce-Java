package com.wu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ping")
public class PingCheck {
	
	@GetMapping("/pingCheck")
	public String pingCheck() {
		
		return "pingCheck";
	}

}
