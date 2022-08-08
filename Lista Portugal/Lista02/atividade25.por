programa
{
	
	funcao inicio()
	{
		real var1=0, var2=0
	escreva("Bem vindo ao programa!(Programa criado por Leonardo GP)")
	escreva("\nPara começar digite o primeiro numero abaixo: \n")
	leia(var1)
	escreva("Otimo, agora digite o segundo numero: ")
	leia(var2)
		se(var1==var2){
			escreva("os 2 numeros são iguais")
		}
		senao{
			escreva("os numeros são diferentes")
			se (var1>var2){
				escreva("e ",var1," é maior do que ", var2)
			}
			senao{
				escreva("e ",var2," é maior do que ", var1)
			}
		}


 
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 499; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */