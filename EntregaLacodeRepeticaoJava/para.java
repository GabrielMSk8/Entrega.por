package RepeticaoFor;
import java.util.Scanner;
public class para {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x,SomaPar=0,SomaImpar=0,num;
		 
		 for (x=1;x<=10;x++)
		 {
			 System.out.println("\nEntre com um número: ");
			 num = leia.nextInt();
			 
			 if(num % 2 == 0)
			 {
				 SomaPar++;
			 }
			 else 
			 {
				 SomaImpar++;
			 }
			 
			 }
		 
		 System.out.println("\nA quantidade de números pares é de: "+SomaPar);
		 System.out.println("\nA quantidade de números ímpares é de: "+SomaImpar);

		 
		 }

	}

	


