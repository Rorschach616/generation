package Lista1;

import java.util.Scanner;

public class ex_3 {

	public static void main(String[] args) {
		int evento, hora, minuto;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a dura��o de um evento da f�brica em segundos: ");
		evento = ler.nextInt();
		
		hora = evento / 3600;

		minuto = hora * 60;

		System.out.println("A dura��o em horas � "+hora+", em minutos � "+ minuto+" e em segundos � "+ evento);
		
		
		

	}

}
