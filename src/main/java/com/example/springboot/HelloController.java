package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String variable0 = "Hello BCA Team!<br />Best wishes from Spring + Tanzu!";
		String variable1 = "<br/><br/><b>Front end change to the Typescript</b></br>";
		return variable0 + variable1;
	}

}