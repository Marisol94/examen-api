/**
 * 
 */
package com.mso.datos.service;

import com.mso.datos.model.DtoRequestAlmacenar;
import com.mso.datos.model.DtoResponseAlmacenar;

/**
 * @author sol12
 *
 */
public interface AlmacenarDatosService {
	
	public DtoResponseAlmacenar almacenar(DtoRequestAlmacenar request);
	

}
