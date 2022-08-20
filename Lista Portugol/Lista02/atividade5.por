programa
{
	inclua biblioteca Matematica --> mt
	inclua biblioteca Util --> u
	funcao inicio()
	{
	real var1=0.0,var2=0.0,var3=0.0
	cadeia var4=""

	escreva("=============================================================")
	escreva("\n===Bem vindo ao programa!(Programa criado por Leonardo GP)===")
	escreva("\n=============================================================")
	escreva("\nPara começar digite seu nome abaixo: \n")
	leia(var4)
	limpa()
	escreva("=============================================================\n")
	escreva("============", var4,", Que nome bonito!", "==================")
	escreva("\n=============================================================\n")
	escreva("Otimo, agora digite sua primeira nota: ")
	leia(var1)
	limpa()
	escreva("=============================================================\n")
	escreva("Otimo, agora digite sua segunda nota: ")
	leia(var2)
	limpa()
	escreva("=============================================================\n")
	escreva("Otimo, agora digite sua terceira nota: ")
	leia(var3)
	limpa()
	escreva("=============================================================\n")
	escreva("========================Calculando nota(10%)=================\n")
	escreva("=============================================================\n")
	u.aguarde(500)
	limpa()
	escreva("=============================================================\n")
	escreva("========================Calculando nota(50%)=================\n")
	escreva("=============================================================\n")
	u.aguarde(500)
	limpa()
	escreva("=============================================================\n")
	escreva("========================Calculando nota(70%)=================\n")
	escreva("=============================================================\n")
	u.aguarde(500)
	limpa()
	escreva("=============================================================\n")
	escreva("========================Calculando nota(100%)=================\n")
	escreva("=============================================================\n")
	u.aguarde(200)
	limpa()
	escreva("=============================================================\n")
	escreva("==============")
	escreva("Perfeito, sua media é igual a: ", mt.arredondar((var1+var2+var3)/3, 3))
	escreva("=============")
		escreva("\n=============================================================")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2264; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */