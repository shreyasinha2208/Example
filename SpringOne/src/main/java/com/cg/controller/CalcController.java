package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.model.BowBean;
import com.cg.service.CalcService;

@Controller
public class CalcController {
	
	@Autowired
	private CalcService service;
	
	@RequestMapping("/")
	public String home(){
		return "showMessage";
	}

	
	@RequestMapping("/addPage")
	public String home1(){
		return "addInput";
	}

	
	@RequestMapping("/viewPage")
	public String home2(){
		return "viewName";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public ModelAndView sum(@RequestParam("Number1") int num1, @RequestParam("Number2") int num2) {

		BowBean bean = new BowBean();
		bean.setNum1(num1);
		bean.setNum2(num2);

		int result = service.sum(bean);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("result", result);
		modelAndView.setViewName("showMessage");
		return modelAndView;

	}
	@RequestMapping(method = RequestMethod.POST, value = "/view")
	public ModelAndView view(@RequestParam("name") String name) {

		BowBean bean = new BowBean();
		bean.setName(name);


		String result = service.view(bean);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("result", result);
		modelAndView.setViewName("showMessage");
		return modelAndView;

	}
	
	
}
