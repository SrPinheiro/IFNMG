programa
{
	inclua biblioteca Matematica --> mt
	funcao inicio()
	{
	real var1=0.0,var2=0.0

	escreva("=============================================================")
	escreva("\n===Bem vindo ao programa!(Programa criado por Leonardo GP)===")
	escreva("\n=============================================================")
	escreva("\nPara começar digite a quantidade depositada: \n")
	leia(var1)
	limpa()
	escreva("=============================================================")
	escreva("\n================= ")
	escreva("Você depositou: ", var1)
	escreva(" ======================")
	escreva("\n=============================================================")
	escreva("\n============  ")
	escreva("Seu rendimento sera de: ", (var1*0.007)) // 0.007 = 0,70%
	escreva("   ================")
	escreva("\n=============================================================")
	escreva("\n========== ")
	escreva("E seu saudo total no fim do mês é: ", mt.arredondar(var1+(var1*0.007), 3))
	escreva(" =========")
	escreva("\n=============================================================")
	escreva("\n=============================================================")
	
	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 555; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */