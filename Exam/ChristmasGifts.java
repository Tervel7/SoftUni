package Exam;

import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int adults = 0;
        int kids = 0;
        int toyExpenses = 0;
        int sweaterExpenses = 0;

        while(!input.equals("Christmas")) {
            int age = Integer.parseInt(input);

            if(age<=16) {
                kids++;
                toyExpenses += 5;
            } else {
                adults++;
                sweaterExpenses += 15;
            }

            input = scanner.nextLine();
        }

        System.out.println("Number of adults: " + adults);
        System.out.println("Number of kids: " + kids);
        System.out.println("Money for toys: " + toyExpenses);
        System.out.println("Money for sweaters: " + sweaterExpenses);
    }
}
