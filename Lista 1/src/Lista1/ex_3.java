package Lista1;

import java.util.Scanner;

public class ex_3 {

	public static void main(String[] args) {
		int evento, hora, minuto;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a duração de um evento da fábrica em segundos: ");
		evento = ler.nextInt();
		
		hora = evento / 3600;

		minuto = hora * 60;

		System.out.println("A duração em horas é "+hora+", em minutos é "+ minuto+" e em segundos é "+ evento);
		
		
		

	}

}
