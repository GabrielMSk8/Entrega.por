import java.util.Scanner;

public class entregLacosCondicionais {
    public static void main(String[] args) {
        System.out.println("Exercício 3");

        String nome= "Mariana";
        int idade = 28;

        System.out.println("\nNome da pessoa: " + nome);
        System.out.println("\nIdade da pessoa: " + idade);


        if (idade>= 16  && idade<= 18 ){
            System.out.println("Apta para voto e voto facultativo");
        }
        else if (idade>= 18  && idade<= 65 ){
            System.out.println("Apta para voto e voto obrigatório");
        }
        else if (idade>= 65 ){
            System.out.println("Apta para voto e voto facultativo");
        }
        else if (idade<= 16 ){
            System.out.println("A pessoa não está apta para votar");
        }

        //exercício do luiz
        
        int codigo,quantidade;
        double valor_total;
        Scanner leia = new Scanner(System.in);

        System.out.println("\n\t\t Menu de lanches");
        System.out.println("1 - Cachorro Quente - R$10,00");
        System.out.println("2 - X-Salada - R$15,00");
        System.out.println("3 - X-Bacon - R$18,00");
        System.out.println("4 - Bauru - R$12,00");
        System.out.println("5 - Refrigerante - R$8,00");
        System.out.println("6 - Suco de Laranja - R$13,00");
        
        System.out.println("\nDigite o código da sua compra: ");
        codigo = leia.nextInt();
        
        System.out.println("\nDigite a quantidade desse produto: ");
        quantidade = leia.nextInt();
        
        switch(codigo) {
            case 1: valor_total = quantidade * 10.00;
                    System.out.println("\nVocê comprou "+quantidade+" Cachorro Quente e vai pagar R$ "+valor_total);
                    break;
            case 2: valor_total = quantidade * 15.00;
                    System.out.println("\nVocê comprou X-Salada e vai pagar R$ "+valor_total);
                    break;
            case 3: valor_total = quantidade * 18.00;
                    System.out.println("\nVocê comprou X-Bacon e vai pagar R$ "+valor_total);
                    break;
            case 4: valor_total = quantidade * 12.00;
                    System.out.println("\nVocê comprou Bauru e vai pagar R$ "+valor_total);
                    break;
            case 5: valor_total = quantidade * 8.00;
                    System.out.println("\nVocê comprou Refrigerante e vai pagar R$ "+valor_total);
                    break;
            case 6: valor_total = quantidade * 13.00;
                    System.out.println("\nVocê comprou Suco de Laranja e vai pagarR$ "+valor_total);
                    break;
            default:
                    System.out.println("\nCódigo inválido!!!");
        }
    }
}
