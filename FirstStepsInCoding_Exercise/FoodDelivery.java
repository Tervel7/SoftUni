package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double chickenMenusPrice = Integer.parseInt(scanner.nextLine()) * 10.35;
        double fishMenusPrice = Integer.parseInt(scanner.nextLine()) * 12.4;
        double veganMenusPrice = Integer.parseInt(scanner.nextLine()) * 8.15;

        double menusSum = chickenMenusPrice + fishMenusPrice + veganMenusPrice;
        double desertPrice = menusSum * 0.2;

        double finalPrice = menusSum + desertPrice + 2.5;

        System.out.println(finalPrice);

    }
}
