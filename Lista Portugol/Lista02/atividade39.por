programa
{
	
	funcao inicio()
	{ inteiro idade
	  cadeia nome, gr


       escreva("diga seu nome:") 
       leia(nome) 

	  escreva("diga sua idade:") 
	  leia(idade) 

        se (idade < 17 ou idade > 70){

	     escreva("não esta na faixa de idade")}

       senao{

	  escreva("Selecione o seu grupo de risco:\nAlto medio baixo:")
	  leia(gr) 


	  se (idade >= 17 e idade <= 20 e gr == "baixo"){ 

	  	escreva(nome, " sua classe é 1")}

	  se (idade >= 17 e idade <= 20 e gr == "medio"){

	  	escreva(nome, " sua classe é 2")}

	  se (idade >= 17 e idade <= 20 e gr == "alto"){ 

	  	escreva(nome, " sua classe é 3")}

	           
	  
	  se (idade >= 21 e idade <= 24 e gr == "baixo"){ 

	  	escreva(nome, " sua classe é 2")}

	  se (idade >= 21 e idade <= 24 e gr == "medio"){ 
	  	

	  	escreva(nome, " sua classe é 3")}

	  se (idade >= 21 e idade <= 24 e gr == "alto"){ 

	  	escreva(nome, " sua classe é 4")}


	  se (idade >= 25 e idade <= 34 e gr == "baixo"){ 

	  	escreva(nome, " sua classe é 3")} 

	  se (idade >= 25 e idade <= 34 e gr == "medio"){
	  
	  	escreva(nome, " sua classe é 4")}

	  se (idade >= 25 e idade <= 34 e gr == "alto"){ 

	  	escreva(nome, " sua classe é 5")}

      
       se (idade >= 35 e idade <= 64 e gr == "baixo"){ 

	  	escreva(nome, " sua classe é 4")}

	  se (idade >= 35 e idade <= 64 e gr == "medio"){

	  	escreva(nome, " sua classe é 5")}

	  se (idade >= 35 e idade <= 64 e gr == "alto"){ 

	  	escreva(nome, " sua classe é 6")} 

	 
	  se (idade >= 65 e idade <= 70 e gr == "baixo"){ 

	  	escreva(nome, " sua classe é 7")} 
	  
	  se (idade >= 65 e idade <= 70 e gr == "medio"){ 

	  	escreva(nome, " sua classe é 8")} 
	  
	  se (idade >= 65 e idade <= 70 e gr == "alto"){ 

	  	escreva(nome, "sua classe é 9")} 

       }
	  
	}

		
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 46; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */