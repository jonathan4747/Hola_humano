package com.codingdojo.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorHumano {
	@RequestMapping( value="/", method=RequestMethod.GET )
	public String Nombres( @RequestParam(value="nombre",required=false) String nombre,
						   @RequestParam(value="apellido",required=false) String apellido,
						   @RequestParam(value="times",required=false) Integer times) {
		if (nombre ==null) {
			return "Hello Human";
		}
		else {
			if (apellido == null && times == null) {
				return "Hello " +nombre;
				}
				
				else {
					if (times == null) {
						
						return " Hello "+nombre+" "+apellido;
					}
					else {
						String respuesta = " ";
						for(int i = 1 ; i<=times; i++) {
							respuesta += "<spam>" +
										" Hello "+nombre +
										"</spam>";
						}
						return respuesta;
					
				    }
			    }
			 
		     }
	}
}
