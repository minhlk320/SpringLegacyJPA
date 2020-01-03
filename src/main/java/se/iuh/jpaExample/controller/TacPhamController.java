package se.iuh.jpaExample.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import se.iuh.jpaExample.model.TacGia;
import se.iuh.jpaExample.model.TacPham;
import se.iuh.jpaExample.repository.TacGiaRepository;
import se.iuh.jpaExample.repository.TacPhamRepository;

@Controller
public class TacPhamController {
	@Autowired
	private TacGiaRepository tacGiaRepository;
	@Autowired
	private TacPhamRepository tacPhamRepository;
	
	@RequestMapping(value = "/tacpham", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		List<TacGia> listTacGias = (List<TacGia>) tacGiaRepository.findAll();
		model.addAttribute("list",listTacGias);
		return "tacpham";
	}
	@RequestMapping(value = "/tacpham/add", method = RequestMethod.GET)
	public String add(Locale locale, Model model) {
		model.addAttribute("tacpham", new TacPham());
		model.addAttribute("listTG", (List<TacGia>) tacGiaRepository.findAll());
		return "add";
	}
	@RequestMapping(value = "/tacpham/submit", method = RequestMethod.POST)
	public String save(Locale locale, Model model, @ModelAttribute("tacpham") @Validated TacPham tacpham,@RequestParam(value = "file") MultipartFile image, BindingResult result, HttpSession session) throws IOException {
		if(result.hasErrors()) {
			System.out.println(result);
			model.addAttribute("tacpham", new TacPham());
			model.addAttribute("listTG", (List<TacGia>) tacGiaRepository.findAll());
			return "add";
		}
		tacpham.setHinh(image.getBytes());
		tacPhamRepository.save(tacpham);
		return "redirect:/tacpham";
	}
	@RequestMapping(value = "/tacpham/delete", method = RequestMethod.GET)
	public String delete(Locale locale, Model model) {
		return "home";
	}
	@RequestMapping(value = "/tacpham/update", method = RequestMethod.GET)
	public String update(Locale locale, Model model) {
		return "home";
	}
	
}
