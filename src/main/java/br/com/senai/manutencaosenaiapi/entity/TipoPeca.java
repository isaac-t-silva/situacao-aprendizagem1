package br.com.senai.manutencaosenaiapi.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class TipoPeca {

	
	@Id
	private Integer id;
	
	@Column (name = "descricao")
	@Size(max = 150, message = "A descrição deve conter "
			+ "mais de 150 caracteres")
	private String descricao;
	
	
	
	
	
	
	
	
	
	
}
