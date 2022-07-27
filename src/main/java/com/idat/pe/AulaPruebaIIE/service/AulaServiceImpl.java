package com.idat.pe.AulaPruebaIIE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pe.AulaPruebaIIE.model.Aula;
import com.idat.pe.AulaPruebaIIE.repository.AulaRepository;

@Service
public class AulaServiceImpl implements AulaService{

	@Autowired
	private AulaRepository repo;
	
	
	@Override
	public List<Aula> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Aula obtenerID(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public void guardar(Aula aula) {
		// TODO Auto-generated method stub
		repo.save(aula);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	@Override
	public void actualizar(Aula aula) {
		// TODO Auto-generated method stub
		repo.saveAndFlush(aula);
		
	}
	
	

}
