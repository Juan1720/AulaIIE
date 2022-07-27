package com.idat.pe.AulaPruebaIIE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.pe.AulaPruebaIIE.model.Aula;
import com.idat.pe.AulaPruebaIIE.service.AulaService;

@Controller
@RequestMapping("api/aula/v1")
public class AulaController {
	
	@Autowired
	private AulaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Aula> listar(){
		return service.listar();
	}
	@GetMapping("/listar/{id}")
	public Aula obtener(@PathVariable Integer id) {
		return service.obtenerID(id);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void> guardar(@RequestBody Aula aula) {
		service.guardar(aula);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(Aula aula) {
		service.actualizar(aula);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}

}
