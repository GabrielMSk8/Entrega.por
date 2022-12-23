programa
{
	
	funcao inicio()
	{
         escreva ( "Exercício 3" )

		cadeia nome= "Mariana"
		inteiro idade = 28

		escreva ( "\nNome da pessoa: " , nome)
		escreva ( "\nIdade da pessoa: " , idade)
		
		
			se (idade>= 16  e idade<= 18 ){
		escreva ( "Apta para voto e voto facultativo" )
		}
		senao se (idade>= 18  e idade<= 65 ){
		escreva ( " Apta para voto e voto obrigatório " )
		}
		senao se (idade>= 65 ){
		  escreva ( "Apta para voto e voto facultativo" )
		 }
          senao se (idade<= 16 ){
	escreva ( "A pessoa não está apta para votar" )
	}

	//exercício do luiz


		
		inteiro codigo,quantidade
		real valor_total

		escreva("\n\t\t Menu de lanches")
		escreva("\n 1 - Cachorro Quente - R$10,00")
		escreva("\n 2 - X-Salada - R$15,00")
		escreva("\n 3 - X-Bacon - R$18,00")
		escreva("\n 4 - Bauru - R$12,00")
		escreva("\n 5 - Refrigerante - R$8,00")
		escreva("\n 6 - Suco de Laranja - R$13,00")
		escreva("\nDigite o código da sua compra: ")
		leia(codigo)
		escreva("\nDigite a quantidade desse produto: ")
		leia(quantidade)
		escolha(codigo)
		{
			caso 1:
			valor_total = quantidade * 10.00
			escreva("\nVocê comprou ",quantidade," Cachorro Quente e vai pagar R$ ",valor_total)
			pare
			caso 2:
			valor_total = quantidade * 15.00
			escreva("\nVocê comprou X-Salada e vai pagar R$ ",valor_total)
			pare
			caso 3:
			valor_total = quantidade * 18.00
			escreva("\nVocê comprou X-Bacon e vai pagar R$ ",valor_total)
			pare
			caso 4:
			valor_total = quantidade * 12.00
			escreva("\nVocê comprou Bauru e vai pagar R$ ",valor_total)
			pare
			caso 5:
			valor_total = quantidade * 8.00
			escreva("\nVocê comprou Refrigerante e vai pagar R$ ",valor_total)
			pare
			caso 6:
			valor_total = quantidade * 13.00
			escreva("\nVocê comprou Suco de Laranja e vai pagarR$ ",valor_total)
			pare
			caso contrario:
			escreva("\nCódigo inválido!!!")
		}
		
	}
}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */