package com.generation.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.model.ClienteRegistroModel;
import com.generation.repository.ClienteRepository;
//Esta es la tercera
//metodos para manipular datos
@Service
public class ClienteRegistroService {
private final ClienteRepository clienteRepository;
//Inyeccion de dependencias
public ClienteRegistroService(@Autowired ClienteRepository clienteRepository) {
	this.clienteRepository=clienteRepository;
}
//debemos obtener los datos y poder leerlos por medio de cualquier coleccion 

public ArrayList<ClienteRegistroModel> obtenerDatos(){
	return (ArrayList<ClienteRegistroModel>) clienteRepository.findAll();
}
public ClienteRegistroModel guardarDatos(ClienteRegistroModel clienteRegistroModel) {
	return clienteRepository.save(clienteRegistroModel);
}



//
}
