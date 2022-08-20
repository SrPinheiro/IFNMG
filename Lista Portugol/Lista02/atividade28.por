programa
{
	
	funcao inicio()
	{ inteiro var1=0,sal=0
	cadeia var5=""
		escreva("Bem vindo ao programa!(Programa criado por Leonardo GP)")
		para(inteiro cont=1;cont<=584;cont++){
			escreva("\nDigite seu nome: ")
			leia(var5)
			escreva("Digite seu salario: ")
			leia(var1)
			escreva("Qual o salario minimo do seu pais?")
			leia(sal)
			se(var1<sal*3){
				escreva(var5," Você recebera um reajuste de 50%\nSeu novo salario sera de: ",var1+(var1*0.5))
				}
			senao se(var1>=(sal*3) e var1<=(sal*10)){
				escreva(var5," Você recebera um reajuste de 20%\nSeu novo salario sera de: ",var1+(var1*0.2))
				}
			senao se(var1>(sal*10) e var1<=(sal*20)){
				escreva(var5," Você recebera um reajuste de 15%\nSeu novo salario sera de: ",var1+(var1*0.15))
				}
			senao{
				escreva(var5," Você recebera um reajuste de 20%\nSeu novo salario sera de: ",var1+(var1*0.2))
				
				}


}}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 796; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */