programa
{
	inclua biblioteca Calendario --> c
	
	funcao inicio()
	{inteiro var1,var2,var3,var4
	escreva("Bem vindo ao programa!(Programa criado por Leonardo GP)")
	escreva("\nAgora digite o primeiro numero:")
	leia(var1)
	escreva("\nAgora digite o segundo numero:")
	leia(var2)
	escreva("\nAgora digite o terceiro numero:")
	leia(var3)
	escreva(c. )
	para(inteiro c=1; c<=3;c++){
	se(var2<var1){
		var4=var1
		var1=var2
		var2=var4		
	}
	se (var3<var2){
		var4=var2
		var2=var3
		var3=var4
	}
	se(var3<var1){
		var4=var1
		var1=var3
		var3=var4
	
	}
	}
	escreva(var1,var2,var3)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */