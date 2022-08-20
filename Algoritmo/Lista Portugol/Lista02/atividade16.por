programa
{
	
	funcao inicio()
	{
	real var1=0,var2=0, var3=0,var5=0
	cadeia var4=""

	escreva("Bem vindo ao programa!(Programa criado por Leonardo GP)")
	escreva("\nPara começar digite seu nome abaixo: \n")
	leia(var4)
	escreva("Otimo, agora digite sua primeira nota: \n")
	leia(var1)
	escreva("agora digite sua segunda nota: \n")
	leia(var2)
	escreva("agora digite sua terceira nota: \n")
	leia(var3)
	var5=((var1+var2+var3)/3)
	escreva(var4, " sua média aritmética do semestre é de: ", var5)
	se(var5>= 7){
		escreva("\nE você foi aprovado")
	}
	senao se(var5 >= 5.1 e var5 <= 6.9){
		escreva("\nE você esta de recuperação")
	}
	senao
		escreva("\nE você foi reprovado")
}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 631; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */