package net.tecgurus.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.tecgurus.dto.UsuarioDto;
import net.tecgurus.persistance.UsuarioDAO;

@RestController
public class Usuario {
	@Autowired // deja la inyeccion a SPring
	private UsuarioDAO usuarioDAO;

	// niveles de maduracion REST ?
	// Get Se utiliza para consultas
	// POST se utiliza para insertar datos

	// Response Entity lleva los datos y codigo http junto con las cabeceras
	@PostMapping("/usuario/leer") // spring boot&web implementa que reciba JSON
	public ResponseEntity<UsuarioDto> leerDatos(@RequestBody UsuarioDto dto) // Request body nos ayuda a mapear el Json
																				// recibio y dejarlo en una variable
																				// JAVA
	{
		/*
		 * No es necesario mandar todos las variables, ya que si no viene se quedara en
		 * null
		 */
		UsuarioDto uDto = new UsuarioDto(dto.getName() + " Gonzalez", "mgm_" + dto.getEmail(), "CDMX: " + dto.getDir(),
				dto.getAge() + 100);

		ResponseEntity<UsuarioDto> respuesta = new ResponseEntity<UsuarioDto>(uDto, HttpStatus.CREATED);
		// el created 201 es para insertar correctamente en la base de datos

		return respuesta;

	}

	@PostMapping("/usuario/leerOriginal") // spring boot&web implementa que reciba JSON
	public UsuarioDto leerDatosOriginal(@RequestBody UsuarioDto dto) // Request body nos ayuda a mapear el Json recibio
																		// y dejarlo en una variable JAVA
	{
		/*
		 * No es necesario mandar todos las variables, ya que si no viene se quedara en
		 * null
		 */
		UsuarioDto uDto = new UsuarioDto(dto.getName() + " Gonzalez", "mgm_" + dto.getEmail(), "CDMX: " + dto.getDir(),
				dto.getAge() + 100);
		return uDto;

	}

	@GetMapping("/usuario/consultar")
	public Collection<UsuarioDto> consultar() {
		return usuarioDAO.getAll();
	}

	/********* Getters & Setters ******************/

	public UsuarioDAO getUsuaioDAO() {
		return usuarioDAO;
	}

	public void setUsuaioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

}
