package exercicios.Exercicio3;

import java.util.Scanner;
public class Q5 {
	public void q5(Scanner sc) {
		int n = sc.nextInt();
		long fat = 1;
		for(int i = 1; i <= n; i++) {
			fat *= i;
		}
		System.out.println("fatorial: " + fat);
	}
}
