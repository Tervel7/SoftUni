package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualPriceForBasketballTraining = Integer.parseInt(scanner.nextLine());

        double shoes = annualPriceForBasketballTraining - (annualPriceForBasketballTraining*0.4);
        double clothes = shoes - (shoes * 0.2);
        double ball = clothes/4;
        double accessories = ball/5;

        double finalPrice = annualPriceForBasketballTraining + shoes + clothes + ball + accessories;

        System.out.println(finalPrice);
    }
}
