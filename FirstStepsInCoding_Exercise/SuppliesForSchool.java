package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double penPacksPrice = Integer.parseInt(scanner.nextLine()) * 5.8;
        double markerPacksPrice = Integer.parseInt(scanner.nextLine()) * 7.2;
        double detergentPrice = Integer.parseInt(scanner.nextLine()) * 1.2;
        double discountPercent = (Double.parseDouble(scanner.nextLine())/100);

        double priceSum = penPacksPrice + markerPacksPrice + detergentPrice;
        double finalPrice = priceSum - (priceSum*discountPercent);

        System.out.println(finalPrice);
    }
}
