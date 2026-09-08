package exercicios.Exercicio3;

import java.util.Scanner;
public class Q4 {
	public void q4(Scanner sc) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int par = 0, impar = 0;
		for(int i = a; i <= b; i++) {
			if(i%2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Quantidade pares: " + par);
		System.out.println("Quantidade Impares: " + impar);
	}
}
