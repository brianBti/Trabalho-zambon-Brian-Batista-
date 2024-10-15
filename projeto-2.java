/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        
        System.out.println("Qual o seu gênero? (M ou F) ");
        String sexo = scanner.next();
        
        System.out.println("Quantas cervejas bebeu? ");
        int qtdCerva = scanner.nextInt();

        System.out.println("Quantos refrigerantes bebeu?");
        int qtdRefri = scanner.nextInt();

        System.out.println("Quantos espetinhos comeu?");
        int qtdEspet = scanner.nextInt();
        
        int custoDoIngresso;
        
        if (sexo == "F") {
            custoDoIngresso = 8;
        } else {
            custoDoIngresso = 10;
        }

        double cerva = 5;
        double espet = 7;
        double refri = 3;
	    double couverttaxa = 4;
        double consumoDoUsuario = qtdCerva * cerva + qtdEspet * espet + qtdRefri * refri;
        
        double valorFinal;
        
        if (consumoDoUsuario < 30) {
	        valorFinal = consumoDoUsuario + custoDoIngresso + couverttaxa;
        } else {
            valorFinal = consumoDoUsuario + custoDoIngresso;
        }
	   
	   System.out.println("Consumo R$ " + consumoDoUsuario);
	   System.out.println("Custo do ingresso R$ " + custoDoIngresso);
	   System.out.println("Valor final R$ " + valorFinal);
	}
}