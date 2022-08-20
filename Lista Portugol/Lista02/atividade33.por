programa
{
	
	funcao inicio()
	{ inteiro tipo =0, aula
		escreva("qual seu nivel de professor?")
		escreva("[1]nivel1 [2] nivel2 [3] nivel3\n")
		leia(tipo)
		limpa()
		escreva("quantas aulas você deu? ")
		leia(aula)
		se(tipo==1){
			escreva("no fim do mês você ganhara: ", 12*aula," Reais")
		}
		se(tipo==2){
			escreva("no fim do mês você ganhara: ", 17*aula," Reais")
		}
		se(tipo==3){
			escreva("no fim do mês você ganhara: ", 25*aula," Reais")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 451; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */