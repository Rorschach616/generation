package programas;

import java.util.Locale;
import java.util.Scanner;

import classes.ClientePf;
import classes.ClientePj;

public class ClienteMain {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ClientePf clientePf = new ClientePf();
		ClientePj clientePj = new ClientePj();
		
		
		System.out.print("-------------------CRIAR NOVO CLIENTE-------------------\n");
		System.out.print("Qual tipo de Cliente (F ou J)? ");
		char cli = sc.next().charAt(0);
		
		if(cli == 'F') {
			
			System.out.print("Digite o n�mero da conta pessoa fisica: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Digite o nome da conta: ");
			String nome = sc.nextLine();
			
			System.out.print("Digite o endere�o: ");
			String end = sc.nextLine();
			
			System.out.print("Digite o CPF: ");
			String cpf = sc.nextLine();
			
			
			System.out.print("Quer iniciar com um deposito (S ou N)? ");
			char op = sc.next().charAt(0);
			System.out.print("------------------------------------------------------\n\n");
			
			if(op == 'S') {
				
				System.out.print("Digite o valor do dep�sito inicial: ");
				double deposito = sc.nextDouble();
				
				clientePf = new ClientePf(num, nome, end, deposito, cpf);
				
				System.out.println("\n-------------------DADOS CLIENTE PF-------------------");
				System.out.println("N�mero da Conta: " + clientePf.getNumConta()
											+ "\nNome: " + clientePf.getNome()
											+ "\nEndere�o: " + clientePf.getEndereco()
											+ "\nCpf: " + clientePf.getCpf()
											+ "\nSaldo: " + clientePf.getSaldo());
				System.out.print("------------------------------------------------------\n");
				System.out.print("Valor do novo Deposito: ");
				deposito = sc.nextDouble();
				clientePf.deposito(deposito);
				System.out.print("\nNovo Saldo: " + clientePf.getSaldo());
				
				System.out.print("\nValor do Saque com taxa de 5 reais: ");
				double saque = sc.nextDouble();
				clientePf.saque(saque);
				System.out.print("Novo Saldo: " + clientePf.getSaldo());
				System.out.print("------------------------------------------------------\n");
				
			} else if(op == 'N'){
				
				clientePf = new ClientePf(num, nome, end, cpf);
				
				System.out.println("\n-------------------DADOS CLIENTE PF-------------------");
				System.out.println("N�mero da Conta: " + clientePf.getNumConta()
											+ "\nNome: " + clientePf.getNome()
											+ "\nEndere�o: " + clientePf.getEndereco()
											+ "\nCpf: " + clientePf.getCpf()
											+ "\nSaldo: " + clientePf.getSaldo());
				System.out.print("------------------------------------------------------\n");
				System.out.print("Valor do novo Deposito: ");
				double deposito = sc.nextDouble();
				clientePf.deposito(deposito);
				System.out.print("\nNovo Saldo: " + clientePf.getSaldo());
				
				System.out.print("\nValor do Saque com taxa de 5 reais: ");
				double saque = sc.nextDouble();
				clientePf.saque(saque);
				System.out.print("Novo Saldo: " + clientePf.getSaldo());
				System.out.print("------------------------------------------------------\n");
				
			} else {
				System.out.println("Digite uma das op��es (S ou N)");
			}
			
		} else if(cli == 'J'){
			
			System.out.print("Digite o n�mero da conta pessoa juridica: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Digite o nome da conta: ");
			String nome = sc.nextLine();
			
			System.out.print("Digite o endere�o: ");
			String end = sc.nextLine();
			
			System.out.print("Digite o CNPJ: ");
			String cnpj = sc.nextLine();
			
			
			System.out.print("Quer iniciar com um deposito (S ou N)? ");
			char op = sc.next().charAt(0);
			System.out.print("------------------------------------------------------\n\n");
			
			if(op == 'S') {
				
				System.out.print("Digite o valor do dep�sito inicial: ");
				double deposito = sc.nextDouble();
				
				clientePj = new ClientePj(num, nome, end, deposito, cnpj);
				
				System.out.println("\n-------------------DADOS CLIENTE PJ-------------------");
				System.out.println("N�mero da Conta: " + clientePj.getNumConta()
											+ "\nNome: " + clientePj.getNome()
											+ "\nEndere�o: " + clientePj.getEndereco()
											+ "\nCpf: " + clientePj.getCnpj()
											+ "\nSaldo: " + clientePj.getSaldo());
				System.out.print("------------------------------------------------------\n");
				System.out.print("Valor do novo Deposito: ");
				deposito = sc.nextDouble();
				clientePj.deposito(deposito);
				System.out.println("\nNovo Saldo: " + clientePj.getSaldo());
				
				System.out.print("\nValor do Saque com taxa de 7 reais: ");
				double saque = sc.nextDouble();
				clientePj.saque(saque);
				System.out.print("Novo Saldo: " + clientePj.getSaldo());
				System.out.print("------------------------------------------------------\n");
			} else if(op == 'N'){
				
				clientePj = new ClientePj(num, nome, end, cnpj);
				
				System.out.println("\n-------------------DADOS CLIENTE PF-------------------");
				System.out.println("N�mero da Conta: " + clientePj.getNumConta()
											+ "\nNome: " + clientePj.getNome()
											+ "\nEndere�o: " + clientePj.getEndereco()
											+ "\nCpf: " + clientePj.getCnpj()
											+ "\nSaldo: " + clientePj.getSaldo());
				System.out.print("------------------------------------------------------\n");
				System.out.print("Valor do novo Deposito: ");
				double deposito = sc.nextDouble();
				clientePj.deposito(deposito);
				System.out.println("\nNovo Saldo: " + clientePj.getSaldo());
				
				System.out.print("\nValor do Saque com taxa de 7 reais: ");
				double saque = sc.nextDouble();
				clientePj.saque(saque);
				System.out.print("Novo Saldo: " + clientePj.getSaldo());
				System.out.print("------------------------------------------------------\n");
			} else {
				System.out.println("Digite uma das op��es (S ou N)");
			}
			
		}	else {
			System.out.println("Digite uma das op��es (F ou J)");
		}
		
		sc.close();
		
	}

}
