package exercicios.Exercicio2;

import java.util.Scanner;
public class Q2 {
	public void q2(Scanner sc){
		int anoAt = 2026;
		int ano = sc.nextInt();
		if((anoAt - ano) >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
	}
}
