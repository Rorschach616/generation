package Lista1;

import java.util.Scanner;

public class ex_4 {

	public static void main(String[] args) {
		int a , b, c;
		double r, s, resul;
		Scanner ler = new Scanner(System.in);
		
		
		System.out.print("Digite 3 valores para realizar o cálculo: ");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		
		r = (a+b);
		r = r*r;
		s = (b+c);
		s = s*s;
		
		resul = (r+s)/2;
		
		System.out.println("O resultado é "+ resul);
		
		
		
	}

}
