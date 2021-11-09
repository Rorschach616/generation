package Lista1;

import java.util.Scanner;

public class ex_8 {

	public static void main(String[] args) {
		double custofab, custocon;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o custo de fábrica do carro: ");
		custofab = ler.nextDouble();
		
		custocon = custofab + (custofab * 0.28);
		custocon = custocon + (custofab * 0.45);
		
		System.out.println("O custo do carro ao consumidor é: "+ custocon);
		
		
	}

}
