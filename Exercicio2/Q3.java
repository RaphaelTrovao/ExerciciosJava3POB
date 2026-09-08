package exercicios.Exercicio2;

import java.util.Scanner;
public class Q3 {
	public void q3(Scanner sc){
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float media = (n1 + n2)/2;
		if(media >= 7.0) {
			System.out.println("Aprovado");
		} else if(media >= 5.0) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
	}
}
