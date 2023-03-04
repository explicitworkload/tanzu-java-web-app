package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {

		String wrapper = "<center>";
		String returnResult = "<br><font face='Verdana' size='6'>Selamat Siang Pak Frank, Pak Anton, Ibu Amy & Frank from Spring Boot + Tanzu! </font><br>";
		String addedResult = "<font face='Arial' size='10' style='background-color:tomato;'></font><br>";
		String bcaResult = "";
		String wrapper2 = "</center>";

		return wrapper + returnResult + addedResult + bcaResult + wrapper2;
		
	}

}