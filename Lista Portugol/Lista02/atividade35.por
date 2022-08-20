programa
{
	inclua biblioteca Matematica --> mt
	funcao inicio()
	{ inteiro kw, tipo
		escreva("quantos kw você gastou esse mês?")
		leia(kw)
		escreva("qual seu tipo cliente? [1]Residência [2]Comércio [3]Indústria")
		leia(tipo)
		se(tipo==1){
			escreva("O total da sua conta de luz sera: R$", mt.arredondar(kw*0.60, 3))
		}
		se(tipo==2){
			escreva("O total da sua conta de luz sera: R$", mt.arredondar(kw*0.48, 3))
		}
		se(tipo==3){
			escreva("O total da sua conta de luz sera: R$", mt.arredondar(kw*1.29, 3))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 521; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */