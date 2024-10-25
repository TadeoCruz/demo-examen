/**
 * 
 */
package com.examen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Entidad de base de datos
 */
@Entity
@Data
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nombre;
	private String numeroCliente;
	private String direccion;
	private String fechaNacimiento;
	
}
