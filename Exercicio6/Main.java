package Exercicio62;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor do raio: ");
		Circulo c = new Circulo();
		c.raio = sc.nextDouble();
		System.out.printf("Area: %.2f\n", c.calcularArea());
		System.out.printf("Perimetro: %.2f\n", c.calcularPerimetro());
	}
}
