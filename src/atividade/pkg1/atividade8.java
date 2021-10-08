/*
- Escreva um algoritmo em Java que leia dois números e indique se
são iguais ou se são diferentes.
 */
package atividade.pkg1;
import java.util.Scanner;
public class atividade8 {
    public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        int x , y;
        System.out.println("Digite o primeiro número : ");
        x = ler.nextInt();
        System.out.println("Digite o segundo número : ");
        y = ler.nextInt();
        if( x == y){
             System.out.println("Números são iguais");
        }else{
           System.out.println("Números são diferentes"); 
        }   
    }
}
