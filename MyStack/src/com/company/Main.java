package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Размер первого стека?");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        for (int i = 0; i < m; i++) {
            double n = Math.random();
            n=n*52;
            int k = (int) Math.round(n);
            stack.push(k);
        }
        System.out.println(stack);
        System.out.println();


        Stack<Integer> stack1 = new Stack<Integer>();
        System.out.println("Размер второго стека?");
        Scanner scan1 = new Scanner(System.in);
        int m1 = scan1.nextInt();
        for (int i1 = 0; i1 < m1; i1++) {
            double n1 = Math.random();
            n1 = n1 * 52;
            int k = (int) Math.round(n1);
            stack1.push(k);
        }
        System.out.println(stack1);
        System.out.println();
        System.out.println();


        int kl = stack.peek();
        stack1.push(kl);
        stack.pop();
        System.out.println("В итоге, первый стек:   ");
        System.out.println(stack);
        System.out.println("В итоге, второй стек:    ");
        System.out.println(stack1);

    }
}