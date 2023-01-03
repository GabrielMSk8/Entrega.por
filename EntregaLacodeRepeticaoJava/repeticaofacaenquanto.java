package facaenquanto;
import java.util.Scanner;
public class repeticaofacaenquanto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
	

int num=0,total=0;
		
		do
		{
		 System.out.println("\nEscreva um número: ");
		    num = leia.nextInt();
	
			if(num>0)
			{
			total = total + num;
			}
		
		}
		while(num != 0);
		
		  System.out.println("A soma dos números positivos é de: "+total);
			
			
			
			
			
			
		
		
		

		    
		    
		    
		}
}

