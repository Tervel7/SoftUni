package ConditionalStatements_Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = scanner.nextDouble();
        int puzzles = scanner.nextInt();
        int dolls = scanner.nextInt();
        int teddyBears = scanner.nextInt();
        int minions = scanner.nextInt();
        int trucks = scanner.nextInt();

        int totalToys = puzzles + dolls + teddyBears + minions + trucks;
        double totalPrice = (puzzles * 2.6) + (dolls * 3) + (teddyBears * 4.1) + (minions * 8.2) + (trucks * 2);

        if (totalToys>=50) {
            totalPrice = totalPrice - (totalPrice * 0.25);
        }

        double rent = totalPrice * 0.1;

        if((totalPrice - rent)>excursionPrice) {
            double left = ((totalPrice - rent) - excursionPrice);
            System.out.printf("Yes! %.2f lv left.",left);
        } else {
            double needed = (excursionPrice - (totalPrice - rent));
            System.out.printf("Not enough money! %.2f lv needed.",needed);
        }
    }
}
