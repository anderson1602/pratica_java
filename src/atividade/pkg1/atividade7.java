/*
Escreva um algoritmo em Java imprima na tela a soma dos números
ímpares entre 0 e 50 e a multiplicação dos números pares entre 0 e 50.
 */
package atividade.pkg1;
public class atividade7 {
    public static void main(String []args){
        int a=1, c=0 ; double d=1;
        while(a <= 50){
            int b = a%2;
            if( b != 0)
                c = c + a;
            else
                d = d * a;
            a++;
        }    
            System.out.println("A soma dos números ímpares de 0 a 50 é:"+ c);
            System.out.println("O produto dos números pares de 0 a 50 é:"+ d);      
    }
}
