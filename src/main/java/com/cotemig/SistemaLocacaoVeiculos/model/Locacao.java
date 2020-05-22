package com.cotemig.SistemaLocacaoVeiculos.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Locacao {

	private Integer id;
	private Date dataLocacao;
	private Date horaLocao;
	private Date dataDevolucao;
	private Date horaDevolucao;
	private Integer quilometragemInicial;
	private Integer quilometragemFinal;
	private Double valorTotalLocacao;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getDataLocacao() {
		return dataLocacao;
	}
	
	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	
	public Date getHoraLocao() {
		return horaLocao;
	}
	
	public void setHoraLocao(Date horaLocao) {
		this.horaLocao = horaLocao;
	}
	
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public Date getHoraDevolucao() {
		return horaDevolucao;
	}
	
	public void setHoraDevolucao(Date horaDevolucao) {
		this.horaDevolucao = horaDevolucao;
	}
	
	public Integer getQuilometragemInicial() {
		return quilometragemInicial;
	}
	
	public void setQuilometragemInicial(Integer quilometragemInicial) {
		this.quilometragemInicial = quilometragemInicial;
	}
	
	public Integer getQuilometragemFinal() {
		return quilometragemFinal;
	}
	
	public void setQuilometragemFinal(Integer quilometragemFinal) {
		this.quilometragemFinal = quilometragemFinal;
	}
	
	public Double getValorTotalLocacao() {
		return valorTotalLocacao;
	}
	
	public void setValorTotalLocacao(Double valorTotalLocacao) {
		this.valorTotalLocacao = valorTotalLocacao;
	}
}
