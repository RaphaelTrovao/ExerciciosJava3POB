package exercicios.Exercicio4;

import java.util.Random;
public class Q3 {
	public void q3() {
		Random rand = new Random();
		double[] notas = new double[8];
		for(int i = 0; i < 8; i++) {
			int a = rand.nextInt(101);
			notas[i] = a/10.0;
		}
		int soma = 0;
		for(int i = 0; i < 8; i++) {
			soma += notas[i];
		}
		double media = soma/8;
		System.out.println("media: " + media);
		for(int i = 0; i < 8; i++) {
			if(notas[i] >= media) {
				System.out.println(notas[i]);
			}
		}
	}
}
