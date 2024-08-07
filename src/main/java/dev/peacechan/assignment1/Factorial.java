
package dev.peacechan.assignment1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int total = 1;
        for (int i = 1; i <= number; i++) {
            total = total * i;
        }
        System.out.println("The factorial of " + number + " is:" + total);
    }
}
