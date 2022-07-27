package com.idat.pe.AulaPruebaIIE.service;

import java.util.List;

import com.idat.pe.AulaPruebaIIE.model.Aula;


public interface AulaService {

	List<Aula> listar();
	Aula obtenerID(Integer id);
	void guardar(Aula aula);
	void eliminar(Integer id);
	void actualizar(Aula aula);
	
}
