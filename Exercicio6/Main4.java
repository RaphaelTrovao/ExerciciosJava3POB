package Exercicios64;

import java.util.Scanner;
public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario f = new Funcionario();
		f.salarioBruto = 3245.50;
		System.out.println(f.salarioBruto);
		f.aplicarAumento(10);
		System.out.println(f.salarioBruto);
		System.out.println(f.calcularSalarioLiquido(10));
	}
}
