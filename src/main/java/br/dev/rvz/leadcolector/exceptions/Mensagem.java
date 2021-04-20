package br.dev.rvz.leadcolector.exceptions;

public class Mensagem {
	
	private String campo;
	
	private String mensagem;
	
	

	public Mensagem(String campo, String mensagem) {
		super();
		this.campo = campo;
		this.mensagem = mensagem;
	}

	public Mensagem() {
		super();
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
