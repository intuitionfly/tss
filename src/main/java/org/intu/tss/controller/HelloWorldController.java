package org.intu.tss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/tss")
public class HelloWorldController {
	@RequestMapping("/helloworld")
	public String helloWorld(Model model) {
		Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
		logger.info("Hello world!");
		
		model.addAttribute("message", "Hello World!");
		return "helloworld";
	}
}