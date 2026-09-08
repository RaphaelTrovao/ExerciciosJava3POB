package exercicios.Exercicio2;

import java.util.Scanner;
public class Q4 {
	public void q4(Scanner sc) {
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if(n1 < n2) {
			n1 = n2;
		}
		n2 = sc.nextInt();
		if(n1 < n2) {
			n1 = n2;
		}
		System.out.println(n1);
	}
}
