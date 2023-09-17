package br.com.vinicius.crud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/")
public class HomeController {
	
	@GetMapping(path = "/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/message")
	public ModelAndView message() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("message");
		modelAndView.addObject("message", "Menssagem vinda do servidor");
		return modelAndView;
	}
	
//	@GetMapping(path = "/greetings/{name}")
//	public ModelAndView greetings(@PathVariable String name) {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("greetings");
//		modelAndView.addObject("message", name);
//		return modelAndView;
//	}
	
	@GetMapping(path = "/greetings")
	public ModelAndView greetings(
			@RequestParam(required = false, defaultValue = "Spring", value = "name") String name
			) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("greetings");
		modelAndView.addObject("message", name);
		return modelAndView;
	}

}
