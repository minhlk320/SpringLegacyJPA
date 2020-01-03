package se.iuh.jpaExample.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import se.iuh.jpaExample.model.TacGia;
import se.iuh.jpaExample.repository.TacGiaRepository;

@Controller
public class TacGiaController {
	@Autowired
	private TacGiaRepository tacGiaRepository;
	@RequestMapping(value = "/tacgia", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}
	@RequestMapping(value = "/tacgia/add", method = RequestMethod.GET)
	public String add(Locale locale, Model model) {
		return "home";
	}
	@RequestMapping(value = "/tacgia/delete", method = RequestMethod.GET)
	public String delete(Locale locale, Model model) {
		return "home";
	}
	@RequestMapping(value = "/tacgia/update", method = RequestMethod.GET)
	public String update(Locale locale, Model model) {
		return "home";
	}
}
