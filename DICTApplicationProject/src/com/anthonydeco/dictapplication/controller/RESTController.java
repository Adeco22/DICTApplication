
/**
 * Created by Anthony Deco
 */
package com.anthonydeco.dictapplication.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class RESTController {
	
	@RequestMapping
	public ModelAndView index(HttpServletRequest request) {
		final String path = request.getContextPath();
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("message","This server is coded using Spring MVC framework");
		mv.addObject("path",path);
		return mv;
	}
	
	@RequestMapping("/profile/")
	public ModelAndView myProfile(HttpServletRequest request) {
		final String path = request.getContextPath();
		ModelAndView mv = new ModelAndView("Profile");
		mv.addObject("path",path);
		return mv;
	}
	
	
}
