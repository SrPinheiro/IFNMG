programa
{
	inclua biblioteca Matematica --> mt
	funcao inicio()
	{inteiro sexo, idade
	real tam
	cadeia nome
		escreva("qual seu nome?")
		leia(nome)
		escreva("você é [1]Homem ou [1]Mulher?")
		leia(sexo)
		se(sexo ==1){
		escreva("qual sua altura? [metros]")
		leia(tam)
		se(tam > 1.70){
			escreva("qual sua idade? ")
				leia(idade)
				se(idade <= 20){
					escreva(nome," seu peso ideia é : ", mt.arredondar((72.7*tam)-58, 3))
				
			}
			se(idade >= 21 e idade <=39){
					escreva(nome," seu peso ideia é : ", mt.arredondar((72.7*tam)-53, 3))
		}
		se(idade >= 40){
					escreva(nome," seu peso ideia é : ", mt.arredondar((72.7*tam)-45, 3))
				
		
		
		}
	}
	senao se(tam<=1.70){
		escreva("qual sua idade? ")
				leia(idade)
				se(idade <= 40){
					escreva(nome," seu peso ideia é : ", mt.arredondar((72.7*tam)-50, 3))
				
			}
			se(idade > 40){
					escreva(nome," seu peso ideia é : ", mt.arredondar((72.7*tam)-58, 3))
		}
				
		
		
		}	
	}
	senao se(sexo ==2){
		escreva("qual sua altura? [metros]")
		leia(tam)
		se(tam > 1.50){
			escreva(nome," seu peso ideia é : ", mt.arredondar((62.1*tam)-44.7, 3))
				
			}
		se(tam <= 1.50){
			escreva("qual sua idade?")
			leia(idade)
			se(idade <35){
					escreva(nome," seu peso ideia é : ", mt.arredondar((62.1*tam)-49, 3))
		}
		se(idade >= 35){
				escreva(nome," seu peso ideia é : ", mt.arredondar((62.1*tam)-45, 3))
				
		
		
		}
	}
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 91; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */