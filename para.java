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

pacote  LacoWhile ;
importar  java . . _ Scanner ;
classe  pública enquanto {
	public  static  void  main ( String  args []) {
		
		Scanner  leia = novo  Scanner ( System . in );
		
		int  idade = 0 , menor21 = 0 , maior50 = 0 ;
		
		enquanto ( idade >= 0 )
		{
			Sistema . fora . println ( "\nEntre com uma idade: " );
			idade = leia . proximoInt ();
			
			if ( idade > 0 && idade < 21 )
			{
				menor21 ++;
			}
			else  if ( idade > 50 )
			{
				maior50 ++;
			}
			
			
				
		}
		Sistema . fora . println ( "\nA quantidade de pessoas menor de 21 é de: " + menor21 );
		Sistema . fora . println ( "\nA quantidade de pessoas maior de 50 é de: " + maior50 );
		
		
		
	}
	

}

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




