package ExamPrep;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double priceForANight = Double.parseDouble(scanner.nextLine());
        double percentForOtherExpenses = Integer.parseInt(scanner.nextLine()) * 0.01;

        if(nights>7)
            priceForANight = priceForANight - (priceForANight*0.05);

        double expenseForTheNights = nights * priceForANight;
        double expese = expenseForTheNights + (budget*percentForOtherExpenses);

        if(budget>=expese)
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget - expese);
        else {
            System.out.printf("%.2f leva needed.",expese - budget);
        }
    }
}
