package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        //Храната се пазарува от зоомагазин, като една опаковка храна за кучета е на цена 2.50 лв, а опаковка храна за котки струва 4 лв.
        Scanner scanner = new Scanner(System.in);
        double dogFoodSum = Integer.parseInt(scanner.nextLine()) * 2.5;
        double catFoodSum = Integer.parseInt(scanner.nextLine()) * 4;

        System.out.println(dogFoodSum + catFoodSum + " lv.");
    }
}
