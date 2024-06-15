package Exam;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int locations  = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < locations; i++) {
            double expectedAverage = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int sumOfProduce = 0;

            for (int j = 0; j < days; j++) {
                sumOfProduce += Integer.parseInt(scanner.nextLine());
            }

            double average = (double) sumOfProduce /days;
            if(average>=expectedAverage) {
                System.out.printf("Good job! Average gold per day: %.2f.\n", average);
            } else
                System.out.printf("You need %.2f gold.\n", expectedAverage-average);
        }
    }
}
