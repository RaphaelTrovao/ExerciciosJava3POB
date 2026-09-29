package Exercicios64;

public class Funcionario {
	String nome;
	String cargo;
	double salarioBruto;
	
	void aplicarAumento(double porcentagem){
		salarioBruto += ((salarioBruto + porcentagem)/100);
	}
	double calcularSalarioLiquido(double descontoImposto) {
		return salarioBruto - descontoImposto;
	}
}
