package Exercicio6;


public class Main {
	public static void main(String[] args) {
		Livro l1 = new Livro();
		Livro l2 = new Livro();
		l1.titulo = "Senhor Dos Aneis: A Sociedade do Anel";
		l1.autor = "J.R.R. Tolkien";
		l1.numeroPaginas = 576;
		l2.titulo = "Percy Jackson e o ladrão de raios";
		l2.autor = "Rick Riordan";
		l2.numeroPaginas = 200;
		
		l1.exibirInformacoes();
		l2.exibirInformacoes();
	}
}
