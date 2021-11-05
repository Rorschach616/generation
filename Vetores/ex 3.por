programa
{
	
	funcao inicio()
	{

	inteiro n1[4][6],n2[4][6],m1[4][6],m2[4][6]

	para(inteiro l= 0; l<4 ;l++){
		
		para(inteiro c= 0; c<6 ;c++){
		
		escreva("N1: Digite o valor da linha ",l+1," coluna ",c+1,": ")
		leia(n1[l][c])
		
		
		}}

		escreva("\n")

	para(inteiro l= 0; l<4 ;l++){
		
		para(inteiro c= 0; c<6 ;c++){
		
		escreva("N2: Digite o valor da linha ",l+1," coluna ",c+1,": ")
		leia(n2[l][c])
		
		
		}}

	para(inteiro l= 0; l<4 ;l++){
		
		para(inteiro c= 0; c<6 ;c++){
		
		m1[l][c] = n1[l][c] + n2[l][c]
		
		
		}}
	
	para(inteiro l= 0; l<4 ;l++){
		
		para(inteiro c= 0; c<6 ;c++){
		
		m2[l][c] = n1[l][c] - n2[l][c]
		
		
		}}
		
		escreva("\n")
		escreva("\nPrimeira tabela")
	para(inteiro l= 0; l<4 ;l++){
		escreva("\n")
		para(inteiro c= 0; c<6 ;c++){
		
		escreva(n1[l][c],"\t")
		
		
		}}

		escreva("\n")
		escreva("\nSegunda tabela")
	para(inteiro l= 0; l<4 ;l++){
		escreva("\n")
		para(inteiro c= 0; c<6 ;c++){
		
		escreva(n2[l][c],"\t")
		
		
		}}
		
		escreva("\n")
		escreva("\nSoma das posições iguais das tabelas")
	para(inteiro l= 0; l<4 ;l++){
		escreva("\n")
		para(inteiro c= 0; c<6 ;c++){
		
		escreva(m1[l][c],"\t")
		
		
		}}

		escreva("\n")
		escreva("\nSubtração das posições iguais das tabelas")
	para(inteiro l= 0; l<4 ;l++){
		escreva("\n")
		para(inteiro c= 0; c<6 ;c++){
		
		escreva(m2[l][c],"\t")
		
		
		}}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 812; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */