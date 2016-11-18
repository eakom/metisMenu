package com.eakom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author YiQiang
 * @date 2016-10-28 обнГ11:38:25
 */
@Controller
@RequestMapping(value="/")
public class TestController {
	@RequestMapping(value="/getjsp")
	public String getJsp(){
		return "myjsp";
	}
	@RequestMapping(value="/getHtml")
	public ModelAndView  getHtml(){
		ModelAndView mv = new ModelAndView("redirect:/myhtml.html");
	    return mv;
	}
}
