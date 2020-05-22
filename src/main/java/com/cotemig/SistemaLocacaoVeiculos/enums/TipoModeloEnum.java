package com.cotemig.SistemaLocacaoVeiculos.enums;

public enum TipoModeloEnum {

	HA("Hatch"),
	SU("Suv"),
	SE("Sedan"),
	CA("Caminhonete"),
	CO("Coupé");
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	private TipoModeloEnum(String descricao) {	
	
	}
}
