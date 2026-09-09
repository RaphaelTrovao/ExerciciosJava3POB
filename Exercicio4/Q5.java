package exercicios.Exercicio4;

import java.util.Random;
public class Q5 {
	public void q5() {
		Random rand = new Random();
		int[] array1 = new int[10];
		for(int i = 0; i < 10; i++) {
			array1[i] = rand.nextInt(11);
			System.out.println(array1[i]);
		}
		int[] array2 = new int[6];
		int[] array3 = new int[6];
		int i = 0, k = 0;
		for(int j = 0; j < 10; j++) {
			if(array1[j]%2 == 0) {
				array2[k] = array1[j];
				k++;
			} else {
				array3[i] = array1[j];
				i++;
			}
		}
		for(int j = 0; j < 6; j++) {
			System.out.printf("%d  ", array2[j]);
		}
		System.out.printf("\n");
		for(int j = 0; j < 6; j++) {
			System.out.printf("%d  ", array3[j]);
		}
	}
}
