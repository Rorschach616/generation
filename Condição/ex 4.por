programa
{
	
	funcao inicio()
	{

	inteiro num
	real resto
	escreva("Digite um número: ")
	leia(num)

	resto = num % 2
	
	se(resto == 0){
		
		se(num > 0){
			escreva("\nO número ",num," é par e positivo.")
			
			
			}
		senao{
			escreva("\nO número ",num," é par e negativo.")	
				
				
			}
		
			}
		
		senao{
		
			se(num > 0){
			escreva("\nO número ",num," é ímpar e positivo.")
			
			
			}
		senao{
			escreva("\nO número ",num," é ímpar e negativo.")	
				
				
			}

		
		
		
		
			}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 123; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */