programa{

funcao inicio ()
{

          inteiro numero[10]
		inteiro x=0,num=0,soma=0, somapar=0
		real media=0
		
		para (x=0;x<10;x++) {
			
				escreva("\nEscreva um número: ")
				leia (num) 
			numero[x] = numero[x] + num
			soma += numero[x]
		}

		escreva("\nNúmeros de índice ímpar: ")
		
		para(x=0;x<10;x++)
		{
			se (x % 2 ==1)
			{
				escreva("\n "+numero[x])
				
			}
		
	
		
		}
			escreva("\nSão pares os números: ")
			
			para (x=0;x<10;x++) {
				
			
				se(numero[x] % 2 == 0) 
				{
					escreva(+numero[x])
				 }
				media += (soma)/10
			}
			escreva("\nA média dos números foi de: ",media)
		     
					escreva("\nA soma dos números é de:\n"+soma)
	
		inteiro mat [3][3] ,L=0,C=0,somap=0,somas=0

           para (L=0;L<3;L++)
           { 
           	para(C=0; C<3;C++)
               { 
           		escreva("mat["+L+"]["+C+"]: ")
           		leia(mat[L][C])
                    se(L==C)
                    {
                    	somap = somap + mat[L][C]
                    	
                    }
                     se(L+C==2)
                    {
                    	somas = somas + mat[L][C]
                    	
                    }
    
           }
                   
           }
           
           escreva("\nElementos da diagonal principal: [",mat[0][0],"]","[",mat[1][1],"]","[",mat[2][2],"]")
           escreva("\nElementos da diagonal secúndaria: [",mat[0][2],"]","[",mat[1][1],"]","[",mat[2][0],"]")
           escreva("\nSoma da diagonal principal: ",somap)
           escreva("\nSoma da diagoanl secúndaria: ",somas)
		
		
	}
}		
			
				
		


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1579; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */