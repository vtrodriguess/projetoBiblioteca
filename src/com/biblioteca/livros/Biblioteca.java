package com.biblioteca.livros;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Biblioteca {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	Livros l;
	private ArrayList<Livros> livros = new ArrayList<>();
	private boolean disponivel = false;
	private Date data = new Date();

	public Biblioteca() {

	}

	public Biblioteca(ArrayList<Livros> livros, Date data) {
		this.livros = livros;
		this.data = data;
	}

	public Biblioteca(Date data) {
		this.data = data;
	}

	public ArrayList<Livros> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livros> livros) {
		this.livros = livros;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void adicionar(Scanner sc) {
		Date data = new Date();

		sc.nextLine();
		System.out.println("Titulo: ");
		String nome = sc.nextLine();
		System.out.println("Autor: ");
		String autor = sc.nextLine();

		l = new Livros(nome, autor, data);

		livros.add(l);

		System.out.println(l.toString());
	}

	public void remover(int indice) {
		livros.remove(indice);

	}

	public boolean verificarDisponibilidade(Livros livro) {

		if (livros.contains(livro)) {
			disponivel = true;
		} else {
			disponivel = false;
		}

		return livros.contains(livro);
	}

	public boolean alugar(Livros nome, Date data) {

		if (verificarDisponibilidade(nome)) {
			disponivel = true;
			this.data = data;
			System.out.println("--------------------------------");
			System.out.println(nome.toString() + "\nData de emprestado: " + sdf.format(data));
			livros.remove(nome);

			return true;

		} else {
			disponivel = false;
			System.out.println("INDISPONÍVEL");
			return false;
		}

	}
	
	public String toString() {
		return "" + livros;
	}

}
