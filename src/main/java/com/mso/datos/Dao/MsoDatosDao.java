package com.mso.datos.Dao;

import org.springframework.data.repository.CrudRepository;

import com.mso.datos.model.DtoRequestAlmacenar;


public interface MsoDatosDao extends CrudRepository<DtoRequestAlmacenar, Integer> {

}
