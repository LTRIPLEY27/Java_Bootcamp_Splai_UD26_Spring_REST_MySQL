package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Suministra;
import com.example.demo.services.SuministraServices;

@RestController
@RequestMapping("/api")
public class SuministraController {

	@Autowired
	SuministraServices sumiSERVICES;
	
	@GetMapping("/suministra")
	public List <Suministra> totalSuministra(){
		return sumiSERVICES.totalSuministra(); 
		
	}
}
