package com.joeknowles.TheCode;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	private static final String THECODE = "bushido";
	
	@RequestMapping("/")
	public String index() { return "index.jsp"; }
	
	@RequestMapping(value="/codeCheck", method=RequestMethod.POST)
	public String codeCheck(RedirectAttributes redirectAttributes, @RequestParam(value="code") String code) {
		if (THECODE.equalsIgnoreCase(code))		
			return "redirect:/code";
		redirectAttributes.addFlashAttribute("error", "You must train harder!");
		return "redirect:/";
	}	
	
	@RequestMapping("/code")
	public String code() {
		return "code.jsp";
	}
}
