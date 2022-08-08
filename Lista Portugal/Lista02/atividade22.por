programa
{
	
	funcao inicio()
	{
		inteiro var1=0,var2=0,var3=0,var4=0, cont=0

	escreva("Bem vindo ao programa!(Programa criado por Leonardo GP)")
	
	para(cont=1;cont<=3;cont++){
		escreva("\nDigite o preço de custo do produto: ")
		leia(var1)
		var3=(var3+var1)
		escreva("Digite o preço de venda do produto: ")
		leia(var2)
		var4=(var4+var2)
		se (var1==var2){
			escreva("você nao saiu no prejuizo mas também não lucrou")
		}
		senao se (var1<var2){
			escreva("Você teve um lucro")	
		}
		senao se (var1>var2){
			escreva("você teve um prejuizo")
		}
			
	}
escreva("\nNo total tivemos uma media de: ",var3/3," de custo do produto\nE tivemos uma media de: ",var4/3," de preço de venda")
 
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 475; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */