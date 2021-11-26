programa
{
	
	funcao inicio()
	{
	inteiro filho, mfilho = 0
	real mediasal = 0.0, sal = 0.0, maiorsal = 0.0, salcem = 0.0




	para(inteiro cont = 1;cont <= 20;cont += 1){
		
		escreva("Digite o ",cont,"° salário: ")
		leia(sal)
		
		mediasal = mediasal + sal
		
		se(sal <= 100){
			salcem = salcem + 1
			
			
			}
			
		se(maiorsal < sal){
			maiorsal = sal
			
			}			
		}
		
		mediasal = mediasal / 20
		salcem = (salcem / 20) * 100
		
	para(inteiro cont = 1 ; cont <= 20; cont += 1){
		escreva("\nDigite a ",cont,"° quantidade de filhos: ")
		leia(filho)
		
		mfilho = mfilho + filho
			
		}
		
		mfilho = mfilho / 20

		escreva("\nO maior salário é: ",maiorsal)
		escreva("\nA média salarial é: ",mediasal)
		escreva("\nA média do número de filhos é: ",mfilho)
		escreva("\nO percentual de pessoas com salário até R$100,00 é: ",salcem," %")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 376; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */