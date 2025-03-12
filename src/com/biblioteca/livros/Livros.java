package com.biblioteca.livros;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Livros {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String nome;
	private String autor;
	private Date data = new Date();

	public Livros(String nome, String autor, Date data) {
		this.nome = nome;
		this.autor = autor;
		this.data = data;
	}

	public Livros(String nome, String autor) {
		this.nome = nome;
		this.autor = autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "" + "\nNome= " + nome + "\nAutor= " + autor + "\nData de cadastrado= " + sdf.format(data) + "";
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livros other = (Livros) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(nome, other.nome);
	}

	
	
}
