package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String variable0 = "Selamat Datang di VMware Technology Day<br />Best wishes from Spring Boot + Tanzu!";
		String variable1 = "Test Now!<br/>";
		
		return variable0 + variable1;
	}

}