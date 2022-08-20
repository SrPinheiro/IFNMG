programa
{
	
	funcao inicio()
	{
		inteiro cont=0,var1=0,var2=0
	
	
	
	escreva("Bem vindo ao programa!(Programa criado por Leonardo GP)")
	para(cont=1;cont<=80;cont++){
		escreva("\nPara começar digite o: ", cont, " número: ")
		leia(var1)
		se(var1>=10 e var1<=150){
			var2=var2+1
		}
	}
	escreva(var2," numeros estavam dentro do intervalo de 10-150")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 159; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */