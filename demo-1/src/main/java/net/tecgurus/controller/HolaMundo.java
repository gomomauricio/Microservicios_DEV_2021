package net.tecgurus.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//  localhost:8080/holamundo

@RestController // puede recibir peticiones http | se llama asi por MVC
public class HolaMundo {
	/* una OPERACION, es un metodo desde java, */

	@GetMapping("/holamundo") //
	public String saludar( @RequestParam(required = false) String nombre )  //requestParam variable que viaja dentro de la URL  
	{
		return "Hola " + nombre + " Spring REST";
	}
	
	

	@PostMapping("/adiosmundo")  //
 	public String despedida() {
		return "Adios Mundo";
	}
	
	
	@PostMapping("/adiosmundo/mandamensaje/{mensaje}/despedida")  //
	public String despedida_1(@PathVariable String mensaje) {
		return "Adios Mundo: " + mensaje;
	}
	
	
	@GetMapping("/suma/{numero1}")
	public String suma(@PathVariable Integer numero1, @RequestParam Integer numero2)
	{
		return "La suma es: " + ( numero1 + numero2 );
	}

	
	/*Ejemplo de otra forma para generar operaciones [este ejemplo requiere un envio JSON]*/
	@RequestMapping(value="/myPath",method = RequestMethod.DELETE,consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE) //requestMapping requiere parametros para configurarla
	public String ejemplo()
	{
		return "exito, se elimino el registro";
	}
	
	
	
}
