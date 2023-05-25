package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.logging.Level;
import java.util.logging.Logger;


@RestController
public class HelloController {

	private final static Logger LOGGER = Logger.getLogger(HelloController.class.getName());

	@GetMapping("/0")
	public String index() {
		log();
		return "0";
	}

	@GetMapping("/1")
	public String num1() {
		log();
		return "1";
	}

	@GetMapping("/2")
	public String num2() {
		log();
		return "2";
	}

	@GetMapping("/3")
	public String num3() {
		log();
		return getnum3();
	}

	public String getnum3(){
		return "3";
		
	}

	public void log(){
		LOGGER.setLevel(Level.INFO);
        LOGGER.info("app 2 reached app 1");
	}
}