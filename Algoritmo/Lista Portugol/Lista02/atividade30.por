programa
{
	
	funcao inicio()
	{
	cadeia var1,var4
	inteiro var2=0,var3=0
	escreva("Bem vindo ao programa!(Programa criado por Leonardo GP)")
	escreva("\nAgora digite seu nome:")
	leia(var1)
	escreva("Agora digite seu sexo Homem(H) ou Mulher (M):")
	leia(var4)
	escreva("Agora digite sua idade:")
	leia(var3)
	escreva("Agora digite seu salario fixo:")
	leia(var2)
	se(var4=="H" ou var4=="h"){
		se(var3>=30){
			escreva(var1," Seu salario liquido é igual a: ", var2+100)
		}
		senao{
			escreva(var1," Seu salario liquido é igual a: ", var2+50)
		}
	}
	senao se(var4=="M" ou var4=="m"){
		se(var3>=30){
			escreva(var1," Seu salario liquido é igual a: ", var2+200)
		}
		senao{
			escreva(var1," Seu salario liquido é igual a: ", var2+80)
		}
	}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 757; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */