package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Piezas;
import com.example.demo.services.PiezasServices;

//HACEMOS USO DEL DECORADOS RESCONTROLLER PARA IMPLEMENTAR EL MAPPEO
@RestController
@RequestMapping("/api")
public class PiezasController {

	//PARA HACER USO DE LOS MÉTODOS IMPLEMENTAMOS UNA INSTANCIA DEL TIPO SERVICE SEGÚN LA CLASE
	@Autowired
	PiezasServices piezasSERVICES;
	
	@GetMapping("/piezas")
	public List<Piezas> totalPiezas(){
		return piezasSERVICES.totalPiezas();
	}
}
