/**
 * 
 */
package com.examen.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.bean.ClienteDTO;
import com.examen.entity.Cliente;
import com.examen.exeption.ClienteNotFound;
import com.examen.repository.ClienteRepository;

/**
 * Servicio que implementa la logica para guardado de informacion
 */
@Service
public class ClienteServiceImpl {

	//Repositorio de persistencia
	@Autowired
	private ClienteRepository clienteRepository;
	
	/**
	 * Alta de nuevo cliente
	 * @param cliente
	 * @return
	 */
	public Long altaCliente(ClienteDTO cliente) {
		
		//se crea una nueva identidad de BD 
		Cliente c = new Cliente();
		BeanUtils.copyProperties(cliente, c);
		
		//se guarda la informacion
		c = clienteRepository.save(c);
		
		//devuelve el id del nuevo cliente
		return c.getId();
		
	}
	
	/**
	 * Busqueda por numero de cliente
	 * @param numeroCliente
	 * @return
	 */
	public ClienteDTO getCliente(String numeroCliente) {
		
		Cliente c = clienteRepository
				.findByNumeroCliente(numeroCliente)
				.orElseThrow(
						() -> new ClienteNotFound("Cliente no registrado"));
		
		ClienteDTO cliente = new ClienteDTO();
		BeanUtils.copyProperties(c, cliente);
		
		return cliente;
		
	}
	
	
	
}
