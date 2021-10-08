/*
 - Escreva um algoritmo em Java para ler um valor inteiro (aceitar
somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido.
 */
package atividade.pkg1;
import java.util.Scanner;
public class atividade6 {
    public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        int x , a = 0;
        System.out.println("Digite um número entre 1 e 10 : ");
        x = ler.nextInt();
        if( x < 1 || x > 10){
            System.out.println("Digite um número entre 1 e 10 : ");
        }else{
            for(int i = 1; i <= 10; i++){
             a = x * i;
             System.out.println(x +" x " + i + " = " + a ); 
            }
        }    
    } 
}
