programa
{
	
	funcao inicio()
	{
	real var1=0.0, var2=0.0, var4 =0.0, var5 =0.0
	cadeia var3=""
	escreva("=============================================================")
	escreva("\n===Bem vindo ao programa!(Programa criado por Leonardo GP)===")
	escreva("\n=============================================================")
	escreva("\nPara começar digite seu nome abaixo: \n")
	leia(var3)
	limpa()
	escreva("=============================================================\n")
	escreva("============", var3," Que nome bonito!", "==================")
	escreva("\n=============================================================\n")
	escreva("Qual o seu salario fixo?")
	leia(var1)
	limpa()
	escreva("=============================================================\n")
	escreva("Agora informe quanto você vendeu este mês em dinheiro\n")
	leia(var2)
	limpa()
	escreva("=============================================================\n")
	escreva("=====Perfeito, ", var3, " seu salario liquido é: R$", (var1+(var2*0.15))," =====")
	escreva("\n=============================================================\n")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 660; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */