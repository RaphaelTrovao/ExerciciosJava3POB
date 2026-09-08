package exercicios.Exercicio3;

import java.util.Scanner;
public class Q3 {
	public void q3(Scanner sc) {
		boolean firstT = true;
		int senha;
		int senhaD = 2026;
		do {
			if(!firstT) {
				System.out.println("Senha incorreta tente novamente");
			}
			senha = sc.nextInt();
			firstT = false;
		} while (senha != senhaD);
		System.out.println("Acesso autorizado");
	}
}
