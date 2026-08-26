package exercicios;

import java.util.Scanner;
public class Questao2 {
	public void Q2(Scanner sc){
		int hora = sc.nextInt();
		double salario = sc.nextDouble();
		double tot = (salario * hora);
		double desc = tot * (10.0/100.0);
		System.out.println(tot);
		tot = tot - desc;
		System.out.println(tot);
	}
}
