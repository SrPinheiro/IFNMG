programa
	{
		inclua biblioteca Matematica --> mt
	funcao inicio()
	{
	real var1=0.0, var2=0.0
	escreva("=============================================================")
	escreva("\n===Bem vindo ao programa!(Programa criado por Leonardo GP)===")
	escreva("\n=============================================================")
	escreva("\nVamos la, para começar digite a distancia percorrida(KM) abaixo: \n")
	leia(var1)
	limpa()
	escreva("=============================================================\n")
	escreva("Otimo, agora digite a quantidade de combustivel gasto(L):\n")
	leia(var2)
	limpa()
	escreva("=============================================================\n")
	escreva("a media de consumo do seu veiculo é igual a: ",mt.arredondar(var1/var2, 3),"Km/L") // valor arrendondado
	escreva("\n=============================================================\n")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 783; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */