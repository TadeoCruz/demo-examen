package com.examen.bean;

import lombok.Data;

/**
 * Propiedades del cliente
 */
@Data
public class ClienteDTO {

	private String nombre;
	private String numeroCliente;
	private String direccion;
	private String fechaNacimiento;
	
}
