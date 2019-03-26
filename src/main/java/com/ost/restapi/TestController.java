package com.ost.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/test")
	public A test() {
	//	return new String[]{"박찬업", "주선태"};
		A a = new A();
		a.x = 10;
		return a;
	}
}
