package ConditionalStatements_Exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double statistsClothesPrice = Double.parseDouble(scanner.nextLine());

        double decore = budget*0.1;
        if(statists>150) statistsClothesPrice = statistsClothesPrice - (statistsClothesPrice*0.1);

        double expenses = statistsClothesPrice*statists + decore;

        if(budget>=expenses) {
            double left = budget-expenses;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", left);
        } else {
            double needed = expenses-budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", needed);
        }
    }
}
