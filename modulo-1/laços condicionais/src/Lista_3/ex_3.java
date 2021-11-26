package Lista_3;

import java.util.Scanner;

public class ex_3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num,i=0;
		double mult = 0;
		
		do{
			System.out.println("Digite números inteiros");
			System.out.print("0  encerra o programa: ");
			num = ler.nextInt();
				
			if(num % 3  == 0) {
				
			mult = mult + num;
			
			
			}
			
			if(num != 0) {
				
				i++;
				
			}
			
		}while(num != 0);
		
		
		mult = mult / i;
		System.out.println("A média dos números multiplos de 3 é "+mult);
		
	

	}

}
