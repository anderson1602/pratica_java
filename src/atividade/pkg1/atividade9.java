/*
Escreva um algoritmo em Java que imprima a média aritmética dos
números 12, 13, 14 e 15. Imprima também a média dos números 5, 6, 7 e 8. Agora imprima a
soma das duas médias.
 */
package atividade.pkg1;
public class atividade9 {
   public static void main(String []args){
       float a=12, b=5, c=0, d=0, x=0, y=0, z=0;
       while( a <= 15){
           c = c + a;
           a++;
       }
       x = c / 4;
       while( b <= 8){
           d = d + b;
           b++;
       }
       y = d / 4;
       z = x + y;
       System.out.println("Média entre os números 12, 13, 14 e 15 é : " + x);
       System.out.println("\nMédia entre os números 5, 6, 7 e 8 é : " + y);
       System.out.println("\nA soma das duas médias é : " + z ); 
   }
}