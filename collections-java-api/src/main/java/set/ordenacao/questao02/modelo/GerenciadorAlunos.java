package main.java.set.ordenacao.questao02.modelo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	private Set<Aluno> conjuntoAlunos;

	public GerenciadorAlunos() {
		this.conjuntoAlunos = new HashSet<Aluno>();
	}

	public void adicionarAluno(String nome, Long matricula, double media) {
		conjuntoAlunos.add(new Aluno(nome, matricula, media));
	}

	public void removerAluno(long matricula) {
		for (Aluno aluno : conjuntoAlunos) {
			if (aluno.getMatricula() == matricula) {
				conjuntoAlunos.remove(aluno);
				break;
			}
		}
	}

	public Set<Aluno> exibirAlunosPorNome() {
		Set<Aluno> alunosPorNome = new TreeSet<Aluno>(conjuntoAlunos);
		return alunosPorNome;
	}

	public Set<Aluno> exibirAlunosPorNota() {
		Set<Aluno> alunosPorNota = new TreeSet<>(new AlunosPorNota());
		alunosPorNota.addAll(conjuntoAlunos);
		return alunosPorNota;
	}

	public Set<Aluno> exibirAlunos() {
		return conjuntoAlunos;
	}

}
