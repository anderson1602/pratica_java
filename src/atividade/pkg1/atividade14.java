/*
Escreva uma classe em Java que permita fazer a conversão cambial
entre Dólares e Reais. Considere como taxa de câmbio US$1,00 = R$5,47. Leia um valor em
Dólares pelo teclado e mostre o correspondente em Reais.
 */
package atividade.pkg1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class atividade14 {
     public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        float rS, uS;
        System.out.print("Digite o valor em Dólares (U$) : ");
        uS =ler.nextFloat();
        rS = (float) (uS * 5.47) ;
        System.out.printf("U$ "+uS+" dólares equivalem a : R$"+df.format(rS)+" reais\n");
         
    }   
}


