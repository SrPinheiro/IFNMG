programa
{
	
	funcao inicio()
	{
		inteiro var1=0,var4=0,var2=0,var5=0,cont=0
		cadeia cupnudles=""

	escreva("Bem vindo ao programa!(Programa criado por Leonardo GP)")
	enquanto (cont==0){
		escreva("\nPara começar digite o valor do carro: ")
		leia(var1)
		escreva("Agora digite o ano em que foi fabricado")
		leia(var2)
		se(var2<=2000){
			escreva("o desconto sera de: ", (var1*0.12))
			escreva("\ne o valor a ser pago por este carro sera de: ", var1-(var1*0.12))
			var4=var4+1
			var5=var5+1
			escreva("\nDeseja continuar(S) ou (N)?")
			leia(cupnudles)
			se(cupnudles=="N"){
				cont=1
			}
		}
		se (var2>2000){	
			escreva("o desconto sera de: ", (var1*0.7))
			escreva("\ne o valor a ser pago por este carro sera de: ", var1-(var1*0.07))
			var5=var5+1
			escreva("\nDeseja continuar(S) ou (N)?")
			leia(cupnudles)
			se(cupnudles=="N"){
				cont=1
			}
		}


}
escreva("o total dee carros com ano ate 200 é: ", var4,"\nE o total de carro no geral é: ",var5)

}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 403; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */