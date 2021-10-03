package br.com.dio.primeiro.calculadora;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro número: ");
        a= scan.nextInt();
        System.out.println("Digite o segundo número: ");
        b= scan.nextInt();
        
        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        double dividir = dividir(a, b);
        int multiplicar = multiplicar(a, b);

        System.out.println("somar:  " +somar);
        System.out.println("Subtrair:  " +subtrair);
        System.out.println("multiplicar :  " +multiplicar);
        System.out.println("dividir:  " +dividir);

    }
    public static int somar(int a, int b){
        return a+b;

    }public static int subtrair(int a, int b){
        return a-b;

    }public static int multiplicar(int a, int b){
        return a*b;

    }public static double dividir(double a, double b){
        return a/b;

    }
}
