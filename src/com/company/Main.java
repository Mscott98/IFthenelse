package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int guess = 0;
        int answer = 42;
        Scanner scanner = new Scanner(System.in);

        while(guess != answer)
            System.out.println("Enter a the Temperature:");
            guess = scanner.nextInt();

            int value = Math.abs(guess - answer);

            if (value > 97.5) {
                    System.out.println("Low");
    }
            else if (value < 99.5 ) {
                System.out.println("Normal");
            }

            else{
                System.out.println("hot");
            }


    }
}
