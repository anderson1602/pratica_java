/* - Escreva um algoritmo em Java que calcule e imprima a média e a
soma dos seguintes números: 21, 22, 23, 24 e 25. */


package atividade.pkg1;
public class atividade4 {
    public static void main(String []args){
        int a = 21; int b = 0; int c;
        while(a <= 25){
           b = b + a;
           a++;
        }
        System.out.println("A soma dos números é : " + b);
        c = b / 5;
        System.out.println("A média entre os números é : " + c);
    }
}
