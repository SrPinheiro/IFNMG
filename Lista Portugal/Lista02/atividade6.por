programa
{
	
	funcao inicio()
	{
	real var1=0.0, var2=0.0, var3=0.0
	cadeia var4=""

	escreva("=============================================================")
	escreva("\n===Bem vindo ao programa!(Programa criado por Leonardo GP)===")
	escreva("\n=============================================================")
	escreva("\nPara começar digite o valor ALFA abaixo:\n")
	leia(var1)
	limpa()
	escreva("=============================================================")
	escreva("\nOtimo, agora digite o valor BETA abaixo:\n")
	leia(var2)
	limpa()
	escreva("=============================================================\n")
	escreva("Perfeito, o valor ALFA é: ", var1, " e o valor BETA é igual a: ", var2)
	escreva("\n=============================================================\n")
	escreva("=============Agora com os valores invertido fica=============\n")
	escreva("=============================================================\n")
	var3=var1
	var1=var2
	var2=var3
	escreva("========================= ")
	escreva("ALFA: ", var1)
	escreva(" =========================")
	escreva("\n========================= BETA: ", var2)
	escreva(" =========================")
	escreva("\n=============================================================\n")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 998; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */