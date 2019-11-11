package com.db1.db1start;

import java.util.Scanner;

public class App {

    public static void main (String[] args) {
       Scanner scan = new Scanner(System.in);
       String texto, textoMaiusc, textoMinusc;
           texto = scan.nextLine();
           textoMaiusc = texto.toUpperCase();
           textoMinusc = texto.toLowerCase();

           System.out.println(textoMaiusc);
           System.out.println(textoMinusc);

       double num1, num2;
       num1 = scan.nextDouble();
       num2 = scan.nextDouble();

       if (num1 == num2) {
           System.out.println("Os números são iguais");
       } else if (num1 < num2) {
           System.out.println(num1);
       } else {
           System.out.println(num2);
       }

       Integer somatoria[];
    }
}
