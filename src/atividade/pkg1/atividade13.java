/*
 Escreva uma classe em Java que permita fazer a conversão cambial
entre Reais e Dólares. Considere como taxa de câmbio US$1,00 = R$5,47. Para isso leia um
valor em Reais pelo teclado e mostre o correspondente em Dólares.
 */
package atividade.pkg1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class atividade13 {
     public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        float rS, uS;
        System.out.print("Digite o valor em Reais (R$): ");
        rS =ler.nextFloat();
        uS = (float) (rS / 5.47) ;
        System.out.printf("R$ "+rS+" reais equivalem a : U$ "+df.format(uS)+" dólares\n");
         
    }   
}
