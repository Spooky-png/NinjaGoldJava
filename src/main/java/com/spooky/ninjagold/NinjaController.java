package com.spooky.ninjagold;

import javax.servlet.http.HttpSession;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NinjaController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("pouch") == null) {
		session.setAttribute("pouch", 0);
		session.setAttribute("addtopouch", 0);
		ArrayList<String> dateArray = new ArrayList<String>();
		session.setAttribute("dateArray", dateArray);
		}
		session.getAttribute("dateArray");
		return "gold.jsp";
	}
	@RequestMapping(value="/farm", method=RequestMethod.POST)
	public String farm(HttpSession session) {
		Integer pouch = (Integer) session.getAttribute("pouch");
		double random = Math.random();
		random = (random * 20 + 10);
		int addtopouch = (int)random;
		pouch = pouch + addtopouch;
		session.setAttribute("pouch", pouch);
		session.setAttribute("addtopouch", addtopouch);
		session.getAttribute("dateArray");
		Date date = new Date();
		String dateString = "You entered the Farm and got "+addtopouch+" gold! ("+date+")";
		session.setAttribute("dateArray", dateString);
		
		
		return "redirect:/";
	}
	@RequestMapping(value="/house", method=RequestMethod.POST)
	public String house(HttpSession session) {
		Integer pouch = (Integer) session.getAttribute("pouch");
		double random = Math.random();
		random = (random * 5 + 2);
		int addtopouch = (int)random;
		pouch = pouch + addtopouch;
		session.setAttribute("pouch", pouch);
		session.setAttribute("addtopouch", addtopouch);
		session.getAttribute("dateArray");
		Date date = new Date();
		String dateString = "You entered the Farm and got "+addtopouch+" gold! ("+date+")";
		session.setAttribute("dateArray", dateString);
		
		
		return "redirect:/";
	}
	@RequestMapping(value="/cave", method=RequestMethod.POST)
	public String cave(HttpSession session) {
		Integer pouch = (Integer) session.getAttribute("pouch");
		double random = Math.random();
		random = (random * 10 + 5);
		int addtopouch = (int)random;
		pouch = pouch + addtopouch;
		session.setAttribute("pouch", pouch);
		session.setAttribute("addtopouch", addtopouch);
		session.getAttribute("dateArray");
		Date date = new Date();
		String dateString = "You entered the Farm and got "+addtopouch+" gold! ("+date+")";
		session.setAttribute("dateArray", dateString);
		
		
		return "redirect:/";
	}
	@RequestMapping(value="/casino", method=RequestMethod.POST)
	public String casino(HttpSession session) {
		Integer pouch = (Integer) session.getAttribute("pouch");
		double random = Math.random();
		random = (random * 20 + 10);
		int addtopouch = (int)random;
		pouch = pouch + addtopouch;
		session.setAttribute("pouch", pouch);
		session.setAttribute("addtopouch", addtopouch);
		session.getAttribute("dateArray");
		Date date = new Date();
		String dateString = "You entered the Farm and got "+addtopouch+" gold! ("+date+")";
		session.setAttribute("dateArray", dateString);
		
		
		return "redirect:/";
	}
	@RequestMapping(value="/reset", method=RequestMethod.POST)
	public String reset(HttpSession session) {
		session.setAttribute("pouch", 0);
		return "redirect:/";
	}

}
