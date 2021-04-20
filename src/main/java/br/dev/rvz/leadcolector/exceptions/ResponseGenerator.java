package br.dev.rvz.leadcolector.exceptions;

import java.util.List;

public class ResponseGenerator {
	
	private Integer status;
	
	private String razao;
	
	private String tipoDeErro;
	
	private List<Mensagem> mensagens;
	
	public ResponseGenerator(Integer status, String razao, String tipoDeErro, List<Mensagem> mensagens) {
		super();
		this.status = status;
		this.razao = razao;
		this.tipoDeErro = tipoDeErro;
		this.mensagens = mensagens;
	}

	public ResponseGenerator() {
		super();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public String getTipoDeErro() {
		return tipoDeErro;
	}

	public void setTipoDeErro(String tipoDeErro) {
		this.tipoDeErro = tipoDeErro;
	}

	public List<Mensagem> getMensagens() {
		return mensagens;
	}

	public void setMensagens(List<Mensagem> mensagens) {
		this.mensagens = mensagens;
	}
}
