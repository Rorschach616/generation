package Lista_3;

import java.util.Scanner;

public class ex_2 {

	public static void main(String[] args) {
		Scanner ler  = new Scanner(System.in);
		int idade = 0, j = 0,v = 0;
		
		System.out.println("Digite a idade de uma pessoa");
		System.out.print("Digitar -99 interrompe a execução do programa: ");
		idade = ler.nextInt();
		
		while(idade != -99) {
			
			if(idade < 21) {
				
				j++; 
				
				
			}else if(idade > 50) {
				
				v++;
				
				
			}
			
			System.out.println("Digite a idade de uma pessoa");
			System.out.print("Digitar -99 interrompe a execução do programa: ");
			idade = ler.nextInt();
			
		}
		
		System.out.println("Existem "+j+" pessoas com menos de 21 anos e "+v+" pessoas com mais de 50 anos.");
		
		

	}

}
