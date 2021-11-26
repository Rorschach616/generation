package Lista1;

import java.util.Scanner;

public class ex_1 {

	public static void main(String[] args) {
		
		int dia, mes, ano, resul, resul2;
		Scanner ler = new Scanner(System.in);
		
		
		System.out.print("Digite seu dia de nascimento: ");
		dia = ler.nextInt();
		System.out.print("Digite seu mês de nascimento: ");
		mes = ler.nextInt();
		System.out.print("Digite seu ano de nascimento: ");
		ano = ler.nextInt();
		
		resul = ano - 2021;
		resul = resul * 365;
		
		resul2 = dia - 27;
		resul2 = resul2 + ((mes-10)*31);

		resul2 = (resul + resul2)*-1;
		
		System.out.println(resul2);
		
		
		

	}

}
