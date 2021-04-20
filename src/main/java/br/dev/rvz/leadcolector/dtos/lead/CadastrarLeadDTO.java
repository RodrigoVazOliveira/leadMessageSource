package br.dev.rvz.leadcolector.dtos.lead;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.dev.rvz.leadcolector.models.Lead;


public class CadastrarLeadDTO {

	@NotNull(message = "{campo.naoinformado} campo: primeiroNome")
	@NotEmpty(message = "{campo.vazio} campo: primeiroNome")
	@Length(max = 70, message = "{campo.excedelimite} cmapo: primeiroNome limite: 70")
	private String primeiroNome;
	
	@NotNull(message = "{campo.naoinformado} campo: ultimoNome")
	@NotEmpty(message = "{campo.vazio} campo: ultimoNome")
	@Length(max = 70, message = "{campo.excedelimite} cmapo: ultimoNome limite: 70")
	private String ultimoNome;
	
	@Email(message = "{email.invalido}")
	@NotNull(message = "{campo.naoinformado} campo: ultimoNome")
	@NotEmpty(message = "{campo.vazio} campo: email")
	@Length(max = 70, message = "{campo.excedelimite} cmapo: email limite: 150")
	private String email;

	public CadastrarLeadDTO() {
	}
	
	public CadastrarLeadDTO(
			@NotNull(message = "o campo primeiroNome não foi informado") @NotEmpty(message = "O campo primeiroNome não foi preenchido") @Length(max = 70, message = "O cmapo primeiroNome deve possuir no máximo 70 caracteres") String primeiroNome,
			@NotNull(message = "o campo ultimoNome não foi informado") @NotEmpty(message = "O campo ultimoNome não foi preenchido") @Length(max = 70, message = "O cmapo ultimoNome deve possuir no máximo 70 caracteres") String ultimoNome,
			@Email(message = "E-mail informado é invalido!") @NotNull(message = "o campo email não foi informado") @NotEmpty(message = "O campo email não foi preenchido") @Length(max = 150, message = "O cmapo email deve possuir no máximo 150 caracteres") String email) {
		super();
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.email = email;
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
	
	public Lead converterDtoParaModelo() {
		Lead lead = new Lead();
		lead.setPrimeiroNome(primeiroNome);
		lead.setUltimoNome(ultimoNome);
		lead.setEmail(email);
		return lead;
	}
}
