programa
{
	
	funcao inicio()
	{
	

	real peso, ex, multa

	escreva("Digite o peso em Kg de tomates comprados: ")
	leia(peso)

	se(peso > 50.0){
		
		ex = peso - 50
		multa = ex * 4
		
		escreva("\nHouve um excesso de tomates de ",ex," Kg e uma multa de R$ ",multa)
		
		}
	senao{

		escreva("\nNão houve excesso de tomates em sua compra e o valor da multa é de R$ 0.00")
		
		}


	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */