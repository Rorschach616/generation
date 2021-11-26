package ex_3;
 
import java.util.*;

public class LojaMain {

	public static void main(String[] args) {
		
		int op = 0;
		String prod;
		int qtd = 1;
		
		Dado dados = new Dado();
		ArrayList<String> lista = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		
		//menu

		do {
			
			System.out.println(dados);
			
			op = ler.nextInt();	
		
			if(op == 1) {
				
				System.out.println("Deseja cadastrar quantos produtos?");	
				qtd = ler.nextInt();
				ler.nextLine();
				
				for(int i = 0; i < qtd ;i++) {
				System.out.print((i+1)+ "- ");
					prod = ler.nextLine();
					lista.add(prod);	
			}				
			}else if(op == 2) {
				
				
				for(int i = 0; i < lista.size();i++) {
					System.out.println((i+1)+"- "+lista.get(i)
					+"\n");
				}
				
				System.out.println("\nDeseja remover o produto de qual posição?");
										
				qtd = ler.nextInt();
				
				qtd--;
				
				lista.remove(qtd);
				
				for(int i = 0; i < lista.size();i++) {
					System.out.println((i+1)+"- "+lista.get(i)
					+"\n");
				}
				
				
			}else if(op == 3) {
				System.out.println("\n");
				
				for(int i = 0; i < lista.size();i++) {
					System.out.println((i+1)+"- "+lista.get(i)
					+"\n");
				}
				
				
				
				
			}else if(op == 4 ) {
				
				for(int i = 0; i < lista.size();i++) {
					System.out.println((i+1)+"- "+lista.get(i)
					+"\n");
				}
				
				System.out.println("Deseja atualizar o produto de qual posição?");
				qtd = ler.nextInt();
				ler.nextLine();
				qtd--;
				
				System.out.println("Digite o produto da nova posição");
				prod = ler.nextLine();
				lista.set(qtd, prod);
				for(int i = 0; i < lista.size();i++) {
					System.out.println("\n"+(i+1)+"- "+lista.get(i)
					+"\n");
				}
			}
			
			
		}while(op != 0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
