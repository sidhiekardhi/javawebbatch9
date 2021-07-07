package com.example.traveller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.traveller.entity.Traveller;
import com.example.traveller.repository.TravellerRepository;

@Service
public class TravellerService {
	
	@Autowired
	TravellerRepository travellerRepository;
	
	public List<Traveller> getAllTraveller() {
		// TODO Auto-generated method stub
		return (List<Traveller>) this.travellerRepository.findAll();
	}
	
	public Traveller addMahasiswa(Traveller traveller) {
		// TODO Auto-generated method stub
		
		return  this.travellerRepository.save(traveller);
	
	}

}
