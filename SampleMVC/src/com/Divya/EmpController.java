package com.Divya;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
	
	@RequestMapping(value = "/register.htm", method = RequestMethod.GET)
	public ModelAndView Init()
	{
		ModelAndView mv = new ModelAndView("register");
		System.out.println("controller");
		//mv.setViewName("register");
		Employee e = new Employee();
		mv.addObject("e", e);
		return mv;
	}
	
	@RequestMapping(value = "/register.htm", method = RequestMethod.POST)
	public ModelAndView DisplayFormData(@ModelAttribute("e")Employee e)
	{
		System.out.println("2");
		System.out.println(e);
		System.out.println("2");
		ModelAndView mv = new ModelAndView("success");
		mv.addObject("firstName", e.getFirstName());
		return mv;
	}
	
	

}
