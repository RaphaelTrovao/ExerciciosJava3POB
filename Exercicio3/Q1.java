package exercicios.Exercicio3;

import java.util.Scanner;
public class Q1 {
	public void q1(Scanner sc) {
		int n1 = sc.nextInt();
		for(int i = 0; i<=10; i++) {
			System.out.printf("%d x %d = %d\n", n1, i, (n1 * i));
		}
	}
}
