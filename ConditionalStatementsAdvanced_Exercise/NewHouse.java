package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double total = 0;

        switch (flower) {
            case "Roses":
                total = count * 5;

                if (count > 80){
                    total = total * 0.9;
                }

                break;

            case "Dahlias":
                total = count * 3.80;

                if (count > 90){
                    total = total * 0.85;
                }

                break;

            case "Tulips":
                total = count * 2.80;

                if (count > 80){
                    total = total * 0.85;
                }
                break;

            case "Narcissus":
                total = count * 3.00;

                if (count < 120){
                    total = total * 1.15;
                }
                break;

            case "Gladiolus":
                total = count * 2.50;

                if (count < 80){
                    total = total * 1.20;
                }
                break;
        }

        double diff = Math.abs(total - budget);

        if (budget >= total){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flower, diff);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
