/**
 * 
 */
package com.examen.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Contorlador de exepciones
 */
@RestControllerAdvice
public class ClienteAdvice {

	@ExceptionHandler(ClienteNotFound.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String clienteNoExistente(ClienteNotFound ex) {
		return ex.getMessage();
	}
}
