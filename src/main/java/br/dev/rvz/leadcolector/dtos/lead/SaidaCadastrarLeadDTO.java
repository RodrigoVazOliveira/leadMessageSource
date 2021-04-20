package br.dev.rvz.leadcolector.dtos.lead;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.dev.rvz.leadcolector.models.Lead;

public class SaidaCadastrarLeadDTO {
	
	private Integer id;

	private String primeiroNome;
	
	private String ultimoNome;
	
	private String email;
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dataHora;
	
	

	public SaidaCadastrarLeadDTO() {
		super();
	}

	
	
	public SaidaCadastrarLeadDTO(Integer id, String primeiroNome, String ultimoNome, String email,
			LocalDateTime dataHora) {
		super();
		this.id = id;
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.email = email;
		this.dataHora = dataHora;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	
	public static SaidaCadastrarLeadDTO converterModeloParaDto(Lead lead) {
		return new SaidaCadastrarLeadDTO(
				lead.getId(),
				lead.getPrimeiroNome(),
				lead.getUltimoNome(),
				lead.getEmail(),
				lead.getDataHora()
		);
	}
}
