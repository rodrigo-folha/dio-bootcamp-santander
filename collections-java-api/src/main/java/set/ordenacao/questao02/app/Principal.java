package main.java.set.ordenacao.questao02.app;

import main.java.set.ordenacao.questao02.modelo.GerenciadorAlunos;

public class Principal {
	public static void main(String[] args) {
		GerenciadorAlunos alunos = new GerenciadorAlunos();
		
		alunos.adicionarAluno("Aluno 1", 123456L, 8.9);
		alunos.adicionarAluno("Aluno 2", 234567L, 9.1);
		alunos.adicionarAluno("Aluno 3", 345678L, 8.5);
		alunos.adicionarAluno("Aluno 4", 456789L, 9.9);
		alunos.adicionarAluno("Aluno Aleatorio", 234567L, 10);
		
		System.out.println("Exibindo alunos");
		System.out.println(alunos.exibirAlunos());
		
		System.out.println("Exibindo alunos por nome: ");
		System.out.println(alunos.exibirAlunosPorNome());

		System.out.println("Exibindo alunos por nota: ");
		System.out.println(alunos.exibirAlunosPorNota());
	}

}
