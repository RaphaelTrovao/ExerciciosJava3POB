package exercicios.Exercicio3;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		switch(x) {
		
		case 1:
			Q1 q1 = new Q1();
			q1.q1(scan);
		break;
		case 2:
			Q2 q2 = new Q2();
			q2.q2(scan);
		break;
		case 3:
			Q3 q3 = new Q3();
			q3.q3(scan);
		break;
		case 4:
			Q4 q4 = new Q4();
			q4.q4(scan);
		break;
		case 5:
			Q5 q5 = new Q5();
			q5.q5(scan);
		break;
		}
	}
}
