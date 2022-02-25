package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Proveedores;
import com.example.demo.services.ProveedoresServices;

@RestController
@RequestMapping("/api")
public class ProveedorController {
	
	@Autowired
	ProveedoresServices provSERVICES;
	
	@GetMapping("/proveedores")
	public List<Proveedores> totalProveedores(){
		return provSERVICES.totalProveedores();
	}
	
	//@PostMapping()
}
