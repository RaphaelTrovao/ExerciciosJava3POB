package Exercicio63;

import java.util.Scanner;
public class Main3 {
	public static void main(String[] args) {
		ContaBancaria c = new ContaBancaria();
		Scanner sc = new Scanner(System.in);
		double valor;
		c.depositar(valor = sc.nextDouble());
		c.sacar(valor = sc.nextDouble());
		c.consultarSaldo();
	}
}
