/**
 * 
 */
package com.examen.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examen.entity.Cliente;

/**
 * Guardado en base de datos
 */
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

	/**
	 * Recupera informacion por numero de cliente
	 * @param numeroCliente
	 * @return
	 */
	public Optional<Cliente> findByNumeroCliente(String numeroCliente);
	
}
