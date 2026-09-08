package exercicios.Exercicio2;

import java.util.Scanner;
public class Q5 {
	public void q5(Scanner sc) {
		int lado1 = sc.nextInt();
		int lado2 = sc.nextInt();
		int lado3 = sc.nextInt();
		if((lado1 + lado2) <= lado3 || (lado2 + lado3) <= lado1 || (lado3 + lado1) <= lado2) {
			System.out.println("Erro, triangulo invalido");
		} else {
			if(lado1 == lado2 && lado2 == lado3) {
				System.out.println("Triangulo equilatero");
			} else if(lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
				System.out.println("Triangulo isosceles");
			} else {
				System.out.println("Triangulo escaleno");
			}
		}
	}
}
