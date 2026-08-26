package exercicios;

import java.util.Scanner;
public class Questao3 {
	public void q3(Scanner sc) {
		double altura = sc.nextDouble();
		double base = sc.nextDouble();
		double area = (base * altura);
		double perim = (2 *(base+altura));
		System.out.println(area);
		System.out.println(perim);
	}
}
