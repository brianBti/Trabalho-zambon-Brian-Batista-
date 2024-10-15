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
        
        System.out.println("Qual sua renda mensal?");
        double rendaSalarial = scanner.nextDouble();
        
        System.out.println("Qual sua renda com prestação de serviços?");
        double rendaDeServico = scanner.nextDouble();
        
        System.out.println("Qual sua renda de capital?");
        double rendaDeCapital = scanner.nextDouble();
        
        double impostoSobreSalario;
        
        if (rendaSalarial < 3000) {
            impostoSobreSalario = rendaSalarial * 0.00;
        } else if (rendaSalarial >= 3000 && rendaSalarial < 5000) {
            impostoSobreSalario = rendaSalarial * 0.10;
        } else {
            impostoSobreSalario = rendaSalarial * 0.20;
        }
        
        double impostoSobreServico = rendaDeServico * 0.15;
        double impostoSobreCapital = rendaDeCapital * 0.20;
        double impostoTotal = impostoSobreSalario + impostoSobreServico + impostoSobreCapital;

        System.out.println("Qual foi o custo dos gastos médicos e educacionais?");
        double gastosMedicosEducacionais = scanner.nextDouble();
        double maximoDescontoPossivel = impostoTotal * 0.30;
        
        double desconto;
        
        if (gastosMedicosEducacionais >= maximoDescontoPossivel) {
            desconto = maximoDescontoPossivel;
        } else {
            desconto = gastosMedicosEducacionais;
        }
        
        double impostoFinal = impostoTotal - desconto;
        
        System.out.println("Desconto R$" + desconto);
        System.out.println("Imposto total R$" + impostoTotal);
        System.out.println("Imposto total com desconto R$" + impostoFinal);
        System.out.println("Imposto de Salário R$ " + impostoSobreSalario);
        System.out.println("Imposto de Serviço R$ " + impostoSobreServico);
        System.out.println("Imposto de Capital R$ " + impostoSobreCapital);
	}
}