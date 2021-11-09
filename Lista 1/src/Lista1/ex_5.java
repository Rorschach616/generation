package Lista1;

import java.util.Scanner;

public class ex_5 {

	public static void main(String[] args) {
		
		double a, b, c, res;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite as 3 notas: ");
		a = ler.nextDouble();
		b = ler.nextDouble();
		c = ler.nextDouble();
		
		res = (a * 2 + b * 3 + c * 5)/(10);
		
		System.out.println("O resultado é: "+res);
		
		
	}

}
