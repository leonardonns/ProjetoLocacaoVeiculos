package com.cotemig.SistemaLocacaoVeiculos.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Marca {

	private Integer id;
	private String nome;
	private List<Modelo> listaDeModelos;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@OneToMany(mappedBy="marca")
	public List<Modelo> getListaDeModelos() {
		return listaDeModelos;
	}

	public void setListaDeModelos(List<Modelo> listaDeModelos) {
		this.listaDeModelos = listaDeModelos;
	}
}
