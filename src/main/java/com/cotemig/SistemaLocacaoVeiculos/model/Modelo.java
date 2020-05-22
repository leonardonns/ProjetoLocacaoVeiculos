package com.cotemig.SistemaLocacaoVeiculos.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.cotemig.SistemaLocacaoVeiculos.enums.TipoModeloEnum;

@Entity
public class Modelo {

	private Integer id;
	private String nome;
	private TipoModeloEnum tipo;
	private Marca marca;
	private List<Automovel> listaDeAutomoveis;
	
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
	
	public TipoModeloEnum getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoModeloEnum tipo) {
		this.tipo = tipo;
	}

	@ManyToOne
    @JoinColumn(name="id_marca", nullable=false)
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	@OneToMany(mappedBy="modelo")
	public List<Automovel> getListaDeAutomoveis() {
		return listaDeAutomoveis;
	}

	public void setListaDeAutomoveis(List<Automovel> listaDeAutomoveis) {
		this.listaDeAutomoveis = listaDeAutomoveis;
	}	
}
