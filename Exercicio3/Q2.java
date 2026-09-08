package exercicios.Exercicio3;

import java.util.Scanner;
public class Q2 {
	public void q2(Scanner sc) {
		int n = sc.nextInt();
		int qtd = 0;
		int soma = 0;
		while(n >= 0) {
			soma += n;
			qtd++;
			n = sc.nextInt();
		}
		System.out.println("Total de numeros: " + qtd);
		System.out.println("Soma dos numeros: " + soma);
		System.out.println("Media aritmetica dos numeros: " + (soma/qtd));
	}
}
