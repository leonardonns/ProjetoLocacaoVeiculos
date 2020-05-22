package com.cotemig.SistemaLocacaoVeiculos.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Cliente {

	private Integer id;
	private String nome;
	private String cpf;
	private String email;
	private String celular;
	private Endereco endereco;
	private List<Automovel> listaDeVeiculosAlugados;
	
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
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCelular() {
		return celular;
	}
	
	public void setCelular(String celular) {
		this.celular = celular;
	}

	@OneToOne(mappedBy = "cliente")
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@ManyToMany
    @JoinTable(name = "locacao", joinColumns = @JoinColumn(name = "id_locacao"), inverseJoinColumns = @JoinColumn(name = "id_automovel"))
	public List<Automovel> getListaDeVeiculosAlugados() {
		return listaDeVeiculosAlugados;
	}

	public void setListaDeVeiculosAlugados(List<Automovel> listaDeVeiculosAlugados) {
		this.listaDeVeiculosAlugados = listaDeVeiculosAlugados;
	}	
}
