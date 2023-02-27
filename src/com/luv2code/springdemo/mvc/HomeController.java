package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.model.Student;

@Controller
public class HomeController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/")
	public String showHomePage() {
		return "index";
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "showform";
	}
	
	@RequestMapping("/processForm")
	public String processStudent(@Valid @ModelAttribute("student") Student theStudent, BindingResult theBindingResult) {
		
		System.out.println(theStudent.getFirstName()+" "+theStudent.getLastName());
		if(theBindingResult.hasErrors()) {
			return "showform";
		}else {
			return "helloworld";
		}
	}

	@RequestMapping("/getAllDetails")
	public String getAllDetailsFromProject(@ModelAttribute("student") Student student){
		return "helloworld"
	}
}
