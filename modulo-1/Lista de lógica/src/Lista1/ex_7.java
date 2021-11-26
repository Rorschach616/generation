package Lista1;

import java.util.Scanner;

public class ex_7 {

	public static void main(String[] args) {
		int a, b, c, d, e, f, x, y;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor A: ");
		a = ler.nextInt();
		System.out.print("B:");
		b = ler.nextInt();
		System.out.print("C:");
		c = ler.nextInt();
		System.out.print("D:");
		d = ler.nextInt();
		System.out.print("E:");
		e = ler.nextInt();
		System.out.print("F:");
		f = ler.nextInt();
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
	
		System.out.println("O valor de X é: "+ x);
		System.out.println("O valor de Y é: "+ y);
		
	}
}
