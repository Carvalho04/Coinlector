package br.edu.unifacear.classes;

import java.util.Objects;

public class Pais {

	//Attribute
	
	private int id;
	private String nome;
	private String continente;
	
	
	//Properties
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getContinente() {
		return continente;
	}
	public void setContinente(String continente) {
		this.continente = continente;
	}
	
	
	//Constructor
	
	public Pais() {
		super();
	}
	

	public Pais(int id, String nome, String continente) {
		super();
		this.id = id;
		this.nome = nome;
		this.continente = continente;
	}
	
	
	//Methods
	
	@Override
	public int hashCode() {
		return Objects.hash(continente, id, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return Objects.equals(continente, other.continente) && id == other.id && Objects.equals(nome, other.nome);
	}
	
	
	@Override
	public String toString() {
		return "Pais [id=" + id + ", nome=" + nome + ", continente=" + continente + "]";
	}
	
		
}
