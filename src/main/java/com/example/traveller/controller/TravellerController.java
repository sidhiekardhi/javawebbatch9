package com.example.traveller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.traveller.entity.Traveller;
import com.example.traveller.repository.TravellerRepository;
import com.example.traveller.service.TravellerService;

@Controller
public class TravellerController {

	@Autowired
	TravellerService travellerService;
	
	
	@GetMapping("/traveller/view")
	public String viewIndexMahasiswa(Model model) {
		model.addAttribute("listTraveller", travellerService.getAllTraveller());	
		return "view_traveller";
	}
	
	
	@GetMapping("/traveller/add")
	public String viewAddMahasiswa(Model model) {
		// buat penampung data mahasiswa di halaman htmlnya
		model.addAttribute("traveller",new Traveller());
		return "add_traveller";
	}
	
	@PostMapping("/traveller/view")
	  public String addMahasiswa(@ModelAttribute Traveller traveller, Model model) {
		// buat penampung data mahasiswa di halaman htmlnya
		travellerService.addMahasiswa(traveller);
		model.addAttribute("listTraveller",travellerService.getAllTraveller());
		return "view_traveller";
	}
	
	
	
}
