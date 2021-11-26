programa
{
	
	funcao inicio()
	{

	inteiro cod
	real h, ex,salex, sal

	escreva("Digite seu código: ")
	leia(cod)
	escreva("\nDigite as horas trabalhadas: ")
	leia(h)

	se(h > 50){
		
		ex = h - 50
		salex = ex * 20

		escreva("\nO funcionário ",cod," trabalhou 50 horas resultando em um salário de R$ 500.0 e fez ",ex," horas extras recebendo R$ ",salex)
		}
	senao{
	sal = h * 10
	escreva("\nO funcionário ",cod," trabalhou ",h," horas resultando em um salário de R$ ",sal)	
	
	
	}



	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 399; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */