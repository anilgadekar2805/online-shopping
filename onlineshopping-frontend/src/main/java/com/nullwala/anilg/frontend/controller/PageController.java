package com.nullwala.anilg.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("msg", "welcome to WEB MVC project");
		return mv;
	}

	@RequestMapping(value = "/login")
	public ModelAndView home(@RequestParam(value = "username", required = false) String username) {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("uname", username);
		return mv;
	}
	
	@RequestMapping(value="/about/{contact}" )
	public ModelAndView about(@PathVariable(value = "contact") String about ) {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("msg", about);
		return mv;
	}

}
