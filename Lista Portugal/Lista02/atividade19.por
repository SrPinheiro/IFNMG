programa
{
	
	funcao inicio()
	{
		inteiro cont=0,var1=0,var3=0,var4=0
	cadeia var5="", var2
	
	
	
	escreva("Bem vindo ao programa!(Programa criado por Leonardo GP)")
	para(cont=1;cont<=56;cont++){
		escreva("\nPara começar digite seu nome: ")
		leia(var5)
		escreva("Agora digite sua idade: ")
		leia(var1)
		escreva("Você é Homem ou Mulher?")
		leia(var2)
		se(var2=="Homem" ou var2=="homem"){
			escreva(var5," Você é do sexo Masculino!\n")
			var3=(var3+1)
		}
		senao se(var2=="Mulher" ou var2=="mulher"){
			escreva(var5," Você é do sexo Feminino!\n")
			var4=var4+1
		}
		senao
			escreva("infelizmente o programa não consiguiu identificar seu sexo!\n")
		
	}
	escreva("No final de tudo tivemos um resultado de: ",var3," homens e ",var4," mulheres!")


	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 188; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */