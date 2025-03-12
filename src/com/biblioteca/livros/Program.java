package com.biblioteca.livros;

import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int op = 0;
		Biblioteca b = new Biblioteca();

		do {
			System.out.println(
					"1-CADASTRAR \n2-REMOVER \n3-DISPONIBILIDADE" + "\n4-ALUGAR "
							+ "\n5-LISTAR LIVROS \n6-ENCERRAR");
			op = sc.nextInt();

			switch(op) {
			
			case 1:
				b.adicionar(sc);
				break;
			case 2:
				System.out.println("Deseja remover livro de qual posição?");
				int r = sc.nextInt();
				b.remover(r);
				break;
			case 3:
				System.out.println("Título: ");
				String nome = sc.next();
				System.out.println("Autor: ");
				String autor = sc.next();

				Livros l = new Livros(nome, autor);
				if (b.verificarDisponibilidade(l)) {
					System.out.println("Disponível");
				} else {
					System.out.println("Indisponível");
				}
				break;
			case 4:
				System.out.println("Título: ");
				nome = sc.next();
				System.out.println("Autor: ");
				autor = sc.next();

				Date data = new Date();

				l = new Livros(nome, autor);
				b.alugar(l, data);
				break;
			case 5:
				System.out.println(b.toString());
				break;
			case 6:
				System.out.println("Encerrando");
				break;
			default:
				System.out.println("Opção inválida");
			}

		} while (op != 6);

	}

}
