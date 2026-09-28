package Exercicio63;

public class ContaBancaria {
	String titular;
	String numeroConta;
	double saldo = 0;
	
	void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
		} else {
			System.out.println("Valor inválido!");
		}
	}
	void sacar(double valor) {
		if(saldo >= valor && valor > 0) {
			saldo -= valor;
		} else {
			System.out.println("Valor invalido ou Saldo insuficiente");
		}
	}
	void consultarSaldo() {
		System.out.println(saldo);
	}
}
