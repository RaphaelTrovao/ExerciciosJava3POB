package exercicios.Exercicio4;

import java.util.Scanner;
public class Q1 {
	public void q1(Scanner sc) {
		int[] array = new int[5];
		for(int i = 0; i < 5; i++) {
			array[i] = sc.nextInt();
		}
		for(int i = 4; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
}
