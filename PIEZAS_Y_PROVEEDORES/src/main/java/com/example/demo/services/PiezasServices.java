package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPiezasDAO;
import com.example.demo.dto.Piezas;

//IMPLEMENTAMOS LA INTERFACE DE SERVICE SEGÚN CORRESPONDA A LA ENTIDAD
@Service
public class PiezasServices implements IPiezasServices {

	//hacemos @aUTOWIRED CON LA INTERFACE DAO PARA HACER USO DE SUS MÉTODOS
	@Autowired
	IPiezasDAO piezasDAO;
	
	@Override
	public List<Piezas> totalPiezas() {
		return piezasDAO.findAll();
	}

}
