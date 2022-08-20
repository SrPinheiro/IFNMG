programa
{
	
	funcao inicio()
	{
		real var1=0.0, total=0.0, totalpago=0.0
		inteiro cont=1,comb
		enquanto (cont==1){
	escreva("Bem vindo ao programa!(Programa criado por Leonardo GP)")
	escreva("\nPara começar digite o valor do veiculo: \n")
	leia(var1)
	se(var1==0){
		cont=0
	}
	senao{
		escreva("\nDigite o tipo de combustivel: [1]alcool,[2]Gasolina,[3]diesel: \n")
		leia(comb)
		se(comb ==1){
		escreva("o valor do desconto é ",(var1*0.25) ," e o valor total do carro é : ", var1-(var1*0.25))
		total=total+(var1*0.25)
		totalpago=totalpago+var1-(var1*0.25)
				   }
		se(comb ==2){
		escreva("o valor do desconto é ",(var1*0.21) ," e o valor total do carro é : ",var1-(var1*0.21))
		total=total+(var1*0.21)
		totalpago=totalpago+var1-(var1*0.21)
				   }
				   se(comb ==3){
		escreva("o valor do desconto é ",(var1*0.14) ," e o valor total do carro é : ", var1-(var1*0.14))
			total=total+(var1*0.14)
			totalpago=totalpago+var1-(var1*0.14)
				   }
	
		}
	
	}
	escreva("total de desconto:", total, " e o total a ser pago: ", totalpago)
}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 345; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */