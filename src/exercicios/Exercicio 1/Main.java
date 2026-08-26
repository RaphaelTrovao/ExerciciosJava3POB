package exercicios;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int x = scan.nextInt();
	switch(x) {
	
	case 1: double tempC = scan.nextDouble();
	double far = (tempC * 1.8) + 32;
	System.out.println(far);
	//testando oo
	break;
	case 2:
		Questao2 q2 = new Questao2();
		q2.Q2(scan);
	break;
	case 3:
		Questao3 q3 = new Questao3();
		q3.q3(scan);
	break;
	case 4:
		Questao4 q4 = new Questao4();
		q4.Q4(scan);
	break;
	}
	}
	
}
