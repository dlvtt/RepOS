package com.company;
import java.util.Stack;

//Задание N+1 = №6

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println(stack.isEmpty());
        stack.push(5);
        stack.push(3);
        stack.push(8);
        stack.push(6);
        stack.push(10);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

    }
}
