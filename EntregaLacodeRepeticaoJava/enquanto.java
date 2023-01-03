package LacoWhile;
 import java.util.Scanner;
public class enquanto {
	public static void main (String args[]) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade=0,menor21=0,maior50=0;
		
		while (idade>=0)
		{
			System.out.println("\nEntre com uma idade: ");
			idade = leia.nextInt();
			
			if (idade>0 && idade<21)
			{
				menor21++;
			}
			else if (idade>50)
			{
				maior50++;
			}
			
			
				
		}
		System.out.println("\nA quantidade de pessoas menor de 21 é de: "+menor21);
		System.out.println("\nA quantidade de pessoas maior de 50 é de: "+maior50);
		
		
		
	}
	

}
