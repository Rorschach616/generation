programa
{
	
	funcao inicio()
	{

	real num1, num2, num3

	escreva("Digite 3 número: ")
	leia(num1,num2,num3)

	num1 = num1 * num1
	num2 = num2 * num2
	num3 = num3 * num3
	
	se(num3 >= 1000){
	escreva("\nO valor do quadrado do terceiro número é ", num3)
	}
	senao{

	escreva("\nO valor dos respectivos quadrados são: ",num1,", ",num2,", ",num3)
	
	}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 269; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */