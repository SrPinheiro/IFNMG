programa
{
	
	funcao inicio()
	{
		inteiro var1=0,var2=0,cont=0
		cadeia cupnudles="", sx="", sd="",var3=""

	escreva("Bem vindo ao programa!(Programa criado por Leonardo GP)")
	enquanto (cont==0){
		escreva("\nDigite seu nome: ")
		leia(cupnudles)
		escreva("Agora digite sua idade: ")
		leia(var1)
		escreva ("Agora digite seu sexo:Homem(H) ou Mulher(M)")
		leia(sx)
		escreva("como esta sua saúde? (Bem) ou (Ruim)")
		leia(sd)
		se(var1>=18 e sx=="H" e sd=="Bem"){
			escreva(cupnudles," você esta apto para entrar!")
			var2=var2+1
			escreva("\nDeseja continuar?(S) ou (N)")
			leia(var3)
				se(var3== "N"){
					cont=1
				}
		}
		
		senao {
		 	escreva("Você não esta apto!")
			escreva("\nDeseja continuar?(S) ou (N)")
			leia(var3)
				se(var3== "N"){
					cont=1
				}
		}
}
escreva("No total tivemos ", var2, " Pessoas aptas")
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 488; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */