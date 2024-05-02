package main.java.comparableXcomparator;

public class Livro implements Comparable<Livro> {
	private String titulo;
	private String autor;
	private int ano;

	public Livro(String titulo, String autor, int ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}

	public int compareTo(Livro l) {
		return titulo.compareTo(l.titulo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
