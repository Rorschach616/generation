package Lista1;

import java.util.Scanner;

public class ex_2 {

	public static void main(String[] args) {
	
		int idadedias, dia, mes, ano, resul, resul2;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite sua idade em dias: ");
		idadedias = ler.nextInt();

		ano = idadedias / 365;
		mes = idadedias / 31;
		
		System.out.println("Sua idade em dias �: "+ idadedias +", sua idade em meses �: "+ mes +" e sua dade em anos � "+ ano);
		
	}

}
