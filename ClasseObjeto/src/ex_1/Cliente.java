package ex_1;

public class Cliente {

	private int cod;
	private String nome;
	private int idade;
	private String senha;
	
	Cliente(){
		
		this.cod = 1;
		this.senha = "senha123" ;
	}
	
	public void carac() {
		
		System.out.println("======Cliente======");
		System.out.println("  Código: "+this.cod);
		System.out.println("  Nome: "+this.nome);
		System.out.println("  idade: "+this.idade);
		System.out.println("  senha: "+this.senha);
	
	} 	

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
}
