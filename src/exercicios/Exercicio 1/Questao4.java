package exercicios;

import java.util.Scanner;
public class Questao4 {
	public void Q4(Scanner sc){
		int segundo = sc.nextInt();
		int hora = (segundo/3600);
		int minuto = (segundo%3600) / 60;
		segundo = (segundo%3600) % 60;
		System.out.println(hora);
		System.out.println(minuto);
		System.out.println(segundo);
	}
}
