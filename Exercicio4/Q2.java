package exercicios.Exercicio4;

import java.util.Random;
public class Q2 {
	public void q2() {
		Random rand = new Random();
		int[] array = new int[10];
		//preencher vetor
		for(int i = 0; i < 10; i++) {
			array[i] = rand.nextInt(10);
			System.out.print(array[i]);
		}
		System.out.print("\n");
		//verificar vetor
		int maior = array[0], menor = array[0], posMa = 0, posMe = 0;
		for(int i = 0; i < 10; i++) {
			if(maior < array[i]) {
				maior = array[i];
				posMa = i;
			}
			if(menor > array[i]) {
				menor = array[i];
				posMe = i;
			}
		}
		System.out.println("posiçao maior: " + posMa);
		System.out.println("Maior numero: " + maior);
		System.out.println("posiçao menor: " + posMe);
		System.out.println("Menor numero: " + menor);
	}
}
