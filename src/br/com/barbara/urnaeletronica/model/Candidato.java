package br.com.barbara.urnaeletronica.model;

public class Candidato {

	private String numero;
	private String nome;
	private String apelido;
	
	public Candidato(String numero, String nome, String apelido) {
		
		setNumero (numero);
		setNome  (nome);
		setApelido (apelido);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	

	}


