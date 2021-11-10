package lista_2;

import java.util.Scanner;

public class ex_1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a,b,c;
		
		
		System.out.print("Digite 3 valores para saber o maior: ");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		
		if(a > b) {
			if(a > c) {
				
			System.out.println("O maior número é "+a);	
				
			}else {
				
				System.out.println("O maior número é "+c);
				
			}			
			
			
		}else if(b > c) {
			
			
			System.out.println("O maior número é "+b);
			
			
		}else {
			
			
			System.out.println("O maior número é "+c);
			
		}
		
		
		

	}

}
