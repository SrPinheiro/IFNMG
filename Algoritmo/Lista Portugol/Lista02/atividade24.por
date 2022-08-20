programa
{
	
	funcao inicio()
	{
		real var1=0
		inteiro cont=1

	escreva("Bem vindo ao programa!(Programa criado por Leonardo GP)")
	enquanto (cont==1){
	escreva("\nDigite o numero abaixo: ")
	leia(var1)
	se(var1>0){
		escreva("este numero é positivo")
		escreva("deseja continuar? Sim(1) Nao(0)")
		leia(cont)
	}
	senao se(var1==0){
		escreva("este numero é igual a 0\n")
		escreva("deseja continuar? Sim(1) Nao(0)")
		leia(cont)
	}
	senao{
		escreva("este numero é negativo\n")
		escreva("deseja continuar? Sim(1) Nao(0)")
		leia(cont)
	}
 
	}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 442; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */