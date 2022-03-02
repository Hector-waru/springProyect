package com.generation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import com.generation.model.ClienteRegistroModel;
import com.generation.service.ClienteRegistroService;

public class ClienteRegistroController {
	//inyeccion de servicio para conexion servicio, repositorie y model
		private final ClienteRegistroService clienteRegistroService;
		public ClienteRegistroController(@Autowired ClienteRegistroService clienteRegistroService) {
			this.clienteRegistroService=clienteRegistroService;
		}
		//definimos como vamos acceso
		//nos preocuparemos por guardar los datos de nuestros usuarios
		@PostMapping("/filluser")
		public ClienteRegistroModel guardarDatos(@Autowired ClienteRegistroModel clienteRegistroModel) {
			return clienteRegistroService.guardarDatos(clienteRegistroModel);
		}
		
		
		
//		
}
