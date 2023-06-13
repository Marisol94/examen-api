/**
 * 
 */
package com.mso.datos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mso.datos.Dao.MsoDatosDao;
import com.mso.datos.model.DtoRequestAlmacenar;
import com.mso.datos.model.DtoResponseAlmacenar;
import com.mso.datos.service.AlmacenarDatosService;

/**
 * @author sol12
 *
 */

@Service
public class AlmacenarDatosServiceImpl implements AlmacenarDatosService {

	@Autowired
	MsoDatosDao msoDatos;

	@Override
	public DtoResponseAlmacenar almacenar(DtoRequestAlmacenar request) {

		DtoResponseAlmacenar response = new DtoResponseAlmacenar();

		try {
			response.setDescripcion("ALMACENAR DATOS");
			response.setError(false);
			response.setStatus(200);
			response.setCodigo(0);

			if (!msoDatos.save(request).equals(null)) {
				response.setRespuesta("Datos almacenados con exito");
			} 
			else {
				response.setRespuesta("ocurrio un inconveniente al intentar guardar los datos");
				response.setCodigo(2);
			}

		} catch (Exception e) {
			response.setDescripcion("ALMACENAR DATOS");
			response.setError(true);
			response.setRespuesta(e.getMessage());
			response.setStatus(200);
			response.setCodigo(1);
		}

		return response;
	}

}
