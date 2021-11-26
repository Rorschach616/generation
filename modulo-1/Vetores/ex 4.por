programa
{
	
	funcao inicio()
	{

	inteiro m[3][3], soma = 0, soma2 = 0,col = 0

	para(inteiro l = 0 ;l<3;l++){
		
		para(inteiro c= 0;c<3;c++){
			
			escreva("Digite o valor da linha ",l+1," coluna ",c+1,": ")
			leia(m[l][c])
		soma = soma + m[l][c]
			}
			escreva("\n")
		
		}
		

	para(inteiro l = 0 ;l<3;l++){
		
		para(inteiro c= 0;c<3;c++){
			
			se(l == c){

				soma2 = soma2 + m[l][c]
				
				
				}
			
		}
		
	}
	

	para(inteiro l = 0 ;l<3;l++){
		escreva("\n")
		para(inteiro c= 0;c<3;c++){
			escreva(m[l][c],"\t")
			
		}
	
	}
escreva("\nA soma dos elementos da tabela é: ",soma)
escreva("\nA soma da diagonal principal é: ",soma2)	
	
	


	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 602; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */