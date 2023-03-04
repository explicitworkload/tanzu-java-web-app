package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String returnResult = "<font face='Verdana' size='10'>Greetings from Spring Boot + Tanzu! </font><br>";
		String addedResult = "<font face='Arial' size='20' style='background-color:tomato;'>Hey Hey</font><br>";
		String bcaResult = "";
		return returnResult + addedResult + bcaResult;
	}

}