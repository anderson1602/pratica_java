/*
Escreva um algoritmo em Java que leia 2 números inteiros e
imprima o maior entre eles.
 */
package atividade.pkg1;
import java.util.Scanner;
public class atividade5 {
    public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        int a, b;
        System.out.println("Digite o primeiro número : ");
        a = ler.nextInt();
        
        System.out.println("Digite o segundo número : ");
        b = ler.nextInt();
        
        if ( a > b){
        System.out.println("O maior entre eles é : " + a);
        }else{
            System.out.println("O maior entre eles é : " + b);
        }
    }
}
