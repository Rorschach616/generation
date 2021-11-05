programa
{
	
	funcao inicio()
	{

	real indice
	
	escreva("Digite o índice de poluição medido: ")
	leia(indice)

	se(indice <= 0.25){
	escreva("\nÍndice de poluição em nível aceitável.")


		}
	senao se(indice >= 0.3 e indice < 0.4){
	
	escreva("\nAs industrias do 1° grupo devem suspender suas atividades.")	
	
	
	}
	senao se(indice >= 0.4 e indice < 0.5){
		
	escreva("\nAs industrias do 1° grupo e do 2° grupo devem suspender suas atividades.")
		
		
		
		}
senao{
	
	escreva("\nTodos os grupos industriais devem suspender suas atividades.")
	
	}



	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 514; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */