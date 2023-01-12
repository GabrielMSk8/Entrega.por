package ArrayVetorMatrizEntrega;

import java.util.Scanner;
public class ArrayVetor {

	public static void main(String[] args) {
		 Scanner leia = new Scanner (System.in);
		 
		int numero[] = new int[10]; 
		int x=0,num=0,soma=0 ;
		float media=0;
		
		for (x=0;x<10;x++) {
			
				System.out.println("\nEscreva um número: ");
				num = leia.nextInt();
			numero[x] = numero[x] = num;
			soma += numero[x];
		}

		System.out.println("\nNúmeros de índice ímpar: ");
		
		for (x=0;x<10;x++)
		{
			if (x % 2 ==1)
			{
				System.out.println("\n "+numero[x]);
			}

		}
	
			System.out.println("\nA soma dos números é de: "+soma);
			System.out.println("\nSão pares os números: ");
			
			for (x=0;x<10;x++) {
				if(numero[x] % 2 == 0) {
					System.out.println(+numero[x]);
				
		}
				media += (soma)/10;
			}
			System.out.printf("\nA média dos números foi de: %2.2f",media);

		
	}
			// ArrayMatrizes
	
	
			        int mat[][] = new int[3][3]; 
			        int L, C, somap = 0, somas = 0;
			        Scanner leia = new Scanner(System.in);

			        for(L = 0; L < 3; L++)
			        {
			            for(C = 0; C < 3; C++)
			            {
			                System.out.print("mat["+L+"]["+C+"]: ");
			                mat[L][C] = leia.nextInt();

			                if(L == C) {
			                    somap = somap + mat[L][C];
			                }

			                if(L+C == 2) {
			                    somas = somas + mat[L][C];
			                }

			            }
			        }

			        System.out.println("Elementos da Diagonal Principal: " + mat[0][0] + "|" + mat[1][1] + "|" +mat[2][2]);
			        System.out.println("Elementos da Diagonal Secundaria: " + mat[0][2] + "|" + mat[1][1] + "|" +mat[2][0]);
			        System.out.println("Soma dos Elementos da Diagonal Principal: " + somap);
			        System.out.println("Soma dos Elementos da Diagonal Secundaria: " + somas);

		
                    }
                    }