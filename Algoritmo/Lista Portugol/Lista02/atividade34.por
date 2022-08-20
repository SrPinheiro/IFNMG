programa
{
	
	funcao inicio()
	{ inteiro idade
		escreva("digite sua idade abaixo: ")
		leia(idade)
		se(idade <5 ou idade > 25){
			escreva("idade nao disponivel")
		}
		senao se(idade >=5 e idade <=7){
			escreva("sua idade é categorizada como infatil A")
		}
		senao se(idade >=8 e idade <=10){
			escreva("sua idade é categorizada como infatil B")
		}
		senao se(idade >=11 e idade <=13){
			escreva("sua idade é categorizada como juvenil A")
		}
		senao se(idade >=14 e idade <=17){
			escreva("sua idade é categorizada como juvenil b")
	}
	senao se(idade >=18 e idade <=25){
			escreva("sua idade é categorizada como sênior")
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 644; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */