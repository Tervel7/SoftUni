package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylonQuantity = Integer.parseInt(scanner.nextLine());
        int paintLiters = Integer.parseInt(scanner.nextLine());
        int thinnerLiters = Integer.parseInt(scanner.nextLine());
        int hoursToFinish = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylonQuantity + 2) * 1.5;
        double paintPrince = (paintLiters + (paintLiters * 0.1)) * 14.5;
        double thinnerPrice = thinnerLiters * 5;

        double materialsSumPrice = nylonPrice + paintPrince + thinnerPrice + 0.4;
        double paintersPricePerHour = (materialsSumPrice*0.3)*hoursToFinish;

        double finalPrice = materialsSumPrice + paintersPricePerHour;

        System.out.println(finalPrice);
    }
}
