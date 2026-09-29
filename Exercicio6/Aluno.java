package Exercicio65;

public class Aluno {
	String nome;
	String matricula;
	double nota1;
	double nota2;
	
	double calcularMedia() {
		return (nota1 + nota2)/2;
	}
	String verificarAprovacao() {
		if(calcularMedia() > 7) {
		return "Aprovado"; 
		} else {
			return "Reprovado";
		}
	}
	void imprimirBoletim() {
		System.out.println("nome: " + nome);
		System.out.println("matricula: " + matricula);
		System.out.printf("média: %.2f\n", calcularMedia());
		System.out.println("status: " + verificarAprovacao());
	}
}
