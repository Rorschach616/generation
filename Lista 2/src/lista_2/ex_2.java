package lista_2;

import java.util.Scanner;

public class ex_2 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner ler = new Scanner(System.in);
		
		
		System.out.print("Digite 3 números para colocar em ordem crescente: ");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		
		if(a > b) {
			
			if(a > c) {
				
				if(b > c) {
					
					System.out.println(c+", "+b+", "+a);					
				}else {					
					System.out.println(b+", "+c+", "+a);					
				}				
			}else{
				
				System.out.println(b+", "+a+", "+c);
				
				
			}
			
			
			
		}else if(b > c) {
			
			if(a > c) {
				
				System.out.println(c+", "+a+", "+b);
				
			}else {
				
				System.out.println(a+", "+c+", "+b);
				
				
			}
			
			
			
		}else if(b > a){
			
			System.out.println(a+", "+b+", "+c);
			
			
		}else {
			
			System.out.println(b+", "+a+", "+c);
			
		}
		

	
	
	}

}
