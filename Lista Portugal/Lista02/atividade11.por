programa
{
	inclua biblioteca Matematica --> mt
	funcao inicio()
	{
	real var1=0,var2=0

	escreva("=============================================================")
	escreva("\n===Bem vindo ao programa!(Programa criado por Leonardo GP)===")
	escreva("\n=============================================================")
	escreva("\nPara começar digite o preço do produto abaixo: \n")
	leia(var1)
	limpa()
	escreva("=============================================================\n")
	escreva("Agora digite o percentual de lucro: (ex: 17)") // Professor eu vou dividir por 100 depois
	leia (var2)
	limpa()
	escreva("=============================================================")
	escreva("\nO preço a ser vendido deve ser de: ", mt.arredondar(var1+(var1*(var2/100)), 3))
	escreva("\n=============================================================")
	
	
	
	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 88; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */