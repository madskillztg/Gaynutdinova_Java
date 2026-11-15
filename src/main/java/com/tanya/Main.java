package com.tanya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Task 1: Check the entered number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Hello");
        }

        // Task 2: Check the entered name
        System.out.print("Enter a name: ");
        String name = scanner.next();

        if (name.equals("John")) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }

        // Task 3: Print array elements divisible by 3
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Numbers divisible by 3:");

        for (int num : numbers) {
            if (num % 3 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println();

        // Task 4: Check the bracket sequence
        String brackets = "[((())()(())]]";

        if (isCorrectBrackets(brackets)) {
            System.out.println("The bracket sequence is correct.");
        } else {
            System.out.println("The bracket sequence is incorrect.");
            System.out.println("A correct sequence is: [((())()(()))]");
        }

        scanner.close();
    }

    public static boolean isCorrectBrackets(String sequence) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char ch : sequence.toCharArray()) {
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char opening = stack.pop();

                if ((ch == ')' && opening != '(') ||
                        (ch == ']' && opening != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
