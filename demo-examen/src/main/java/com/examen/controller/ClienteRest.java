/**
 * 
 */
package com.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examen.bean.ClienteDTO;
import com.examen.service.ClienteServiceImpl;

/**
 * Exposicion de servicio
 */
@RestController("clientes")
public class ClienteRest {
	
	/**
	 * Servicio que mantiene la logica y transformacion de datos
	 */
	@Autowired
	private ClienteServiceImpl clienteService;

	/**
	 * Nuevo cliente
	 * @param cliente
	 */
	@PostMapping
	public void altaCliente(@RequestBody ClienteDTO cliente ) {
		
		clienteService.altaCliente(cliente);
		
	}
	
	/**
	 * Recupera informacion de cliente
	 * @param numeroCliente
	 * @return
	 */
	@GetMapping("/{numeroCliente}")
	public ClienteDTO getClienteByNocliente(@PathVariable String numeroCliente) {
		
		return clienteService.getCliente(numeroCliente);
		
	}
	
	
	
}
