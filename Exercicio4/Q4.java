package exercicios.Exercicio4;

import java.util.Scanner;
import java.util.Random;
public class Q4 {
	public void q4(Scanner sc) {
		Random rand = new Random();
		int[] array = new int[6];
		int x = sc.nextInt();
		boolean found = false;
		for(int i = 0; i < 6; i++) {
			array[i] = rand.nextInt(11); 
		}
		int pos = 0;
		for(int j = 0; j < 6; j++) {
			if(array[j] == x) {
				found = true;
				pos = j;
				break;
			}
		}
		if(found) {
			System.out.println("encontrado, posição: " + pos);
		} else {
			System.out.println("Valor não encontrado");
		}
	}
}
