programa
{
	inclua biblioteca Matematica --> mt
	inclua biblioteca Util --> u
	funcao inicio()
	{
	inteiro ciclo=0, var2=0
	real var1=0.0

	escreva("=============================================================")
	escreva("\n===Bem vindo ao programa!(Programa criado por Leonardo GP)===")
	escreva("\n=============================================================")
	escreva("\n========Para começar digite a o preço do produto=============")
	escreva("\n=============================================================")
	leia(var1)
	limpa()
	enquanto(ciclo == 0){
	escreva("=============================================================")
	escreva("\n============Digite quantas parcelas você escolheu============")
	escreva("\n=============================================================")
	leia(var2)
	limpa()
	se(var2<1 ou var2 >5){
		escreva("=============================================================")
		escreva("\n==========A quantidade de parcelas: '", var2,"' não é valida=========")
		escreva("\n==============precisa ser entre 1 e 5 parcelas===============\n")
		escreva("=============================================================")
		u.aguarde(3000)
		limpa()
	}
	senao{
		ciclo = 1
	}
	}
	limpa()
	escreva("=============================================================\n")
	escreva("=========================  Perfeito  ========================\n")
	escreva("=============================================================\n")
	escreva("=========O valor das ",var2," parcelas é igual a: R$", mt.arredondar(var1/var2, 3))
	escreva("============")
	escreva("\n=============================================================\n")
	
	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1554; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */