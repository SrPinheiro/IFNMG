programa
{
	inclua biblioteca Matematica -->mt
	
	funcao inicio()
	
	{
		inteiro matri
	 real no1, no2, no3, result, media
	cadeia nome
		escreva("Digite seu nome")
		leia(nome)
		escreva("Qual sua matricula")
		leia(matri)
		escreva("Digite a nota do laboratorio")
		leia(no1)
		escreva("Digite a nota da avaliação")
		leia(no2)
		escreva("Digite a nota do exame final")
		leia(no3)
		media=mt.arredondar(((no1*2)+(no2*3)+(no3*5))/10, 3)
		se(media >=8 e media <10)
		{
			escreva("\n",nome," ,número de matrícula ",matri," sua nota final é de ",media," e a sua classificação é A")
		}
		se(media >=7 e media <8)
		{
			escreva("\n",nome," ,número de matrícula ",matri," sua nota final é de ",media," e a sua classificaçao é B")
		}
		se(media >=6 e media <7)
		{
			escreva("\n",nome," ,número de matrícula ",matri," sua nota final é de ",media," e a sua classificaçao é C")
		}
		se(media >=5 e media <6)
		{
			escreva("\n",nome," ,número de matrícula ",matri," sua nota final é de ",media," e a sua classificaçao é D")
		}
		se(media >=0 e media <5)
		{
			escreva("\n",nome," ,número de matrícula ",matri," sua nota final é de ",media," e a sua classificaçao é R")
		}
	
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 89; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */