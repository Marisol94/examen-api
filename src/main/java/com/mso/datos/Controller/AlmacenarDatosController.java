/**
 * 
 */
package com.mso.datos.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mso.datos.model.DtoRequestAlmacenar;
import com.mso.datos.model.DtoResponseAlmacenar;
import com.mso.datos.service.impl.AlmacenarDatosServiceImpl;

/**
 * @author sol12
 *
 */

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class AlmacenarDatosController {

	@Autowired
	private AlmacenarDatosServiceImpl almacenarService;

	@PostMapping("/almacenar")
	public DtoResponseAlmacenar almacenaDatos(@RequestBody DtoRequestAlmacenar request) {
		DtoResponseAlmacenar response = new DtoResponseAlmacenar();

		try {
			response = almacenarService.almacenar(request);
		} 
		catch (Exception e) {
			response.setDescripcion("ALMACENAR DATOS");
			response.setError(true);
			response.setRespuesta(e.getMessage());
			response.setStatus(200);
			response.setCodigo(1);
		}

		return response;
	}

}
