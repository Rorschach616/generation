package Lista1;

import java.lang.reflect.Method;
import java.util.Scanner;

public class ex_6 {

	public static void main(String[] args) {
		double x1, y1, x2, y2, x, y, resul;
		Scanner ler = new Scanner (System.in);
		
		
		System.out.println("Digite as coordenadas do primeiro ponto");
		System.out.print("x: ");
		x1 = ler.nextDouble();
		System.out.print("y: ");
		y1 = ler.nextDouble();
		
		System.out.println("Digite as coordenadas do segundo ponto");
		
		System.out.print("x: ");
		x2 = ler.nextDouble();
		System.out.print("y: ");
		y2 = ler.nextDouble();
		
		x = x2 - x1;
		y = y2 - y2;
				
		x = x * x;
		y = y * y;

		resul = x + y;		
		resul = Math.sqrt(resul);
		
		System.out.println("A distância entre os pontos é de: "+resul);
		

	}

}
