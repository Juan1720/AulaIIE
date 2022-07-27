package com.idat.pe.AulaPruebaIIE.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name ="aulas")
public class Aula {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer idAula;
	private String aula;
	
	public Aula() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Aula(Integer idAula, String aula) {
		super();
		this.idAula = idAula;
		this.aula = aula;
	}


	public Integer getIdAula() {
		return idAula;
	}
	public void setIdAula(Integer idAula) {
		this.idAula = idAula;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	
	

}
