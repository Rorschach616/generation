package ex_2;

public class Aviao {

	private String nome;
	private String aeroporto;
	private int id;
	private int acentos;
	
	Aviao(){
		this.id = 1;
	}
	
	public void carac() {
		System.out.println("=========Avião=========");
		System.out.println(" id: "+this.id);
		System.out.println(" Nome: "+this.nome);
		System.out.println(" Aeroporto: "+this.aeroporto);
		System.out.println(" N° de acentos: "+this.acentos);	
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAeroporto(String aeroporto) {
		this.aeroporto = aeroporto;
	}

	public void setAcentos(int acentos) {
		this.acentos = acentos;
	}
	
	
}
