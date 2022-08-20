programa
{	
	inteiro var1,var2,var3
	
	funcao inicio()
	{
		escreva("Digite o primeiro lado: ")
		leia(var1)
		escreva("Digite o segundo lado: ")
		leia(var2)
		escreva("Digite o Terceiro lado: ")
		leia(var3)

		se(var1 == var2 e var2 == var3 e var3 == var1){
			escreva("esse triando é Equilátero!")
		}
		senao se( var1!=0 e var2!=0){
			 escreva("esse triando é isocele!")
		}
		senao{
			escreva("esse triando é Escaleno!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 339; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */