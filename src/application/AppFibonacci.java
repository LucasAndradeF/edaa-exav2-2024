package application;

import java.util.Scanner;

import entities.Fibonacci;

public class AppFibonacci {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual número de Fibonacci você deseja calcular?");
        int n = sc.nextInt();
        Fibonacci fibonacci = new Fibonacci(n);
        System.out.println(fibonacci.text());
        sc.close();
    }
}