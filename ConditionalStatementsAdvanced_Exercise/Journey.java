package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double spendMoney = 0;
        String destination = "";
        String sleepType = "";

        if (budget <= 100 && season.equals("summer")){
            destination = "Bulgaria";
            sleepType = "Camp";
            spendMoney = budget * 0.30;
        }else if (budget <= 100 && season.equals("winter")){
            destination = "Bulgaria";
            sleepType = "Hotel";
            spendMoney = budget * 0.70;

        }else if (budget <= 1000 && season.equals("summer")){
            destination = "Balkans";
            sleepType = "Camp";
            spendMoney = budget * 0.4;
        }else if (budget <= 1000 && season.equals("winter")){
            destination = "Balkans";
            sleepType = "Hotel";
            spendMoney = budget * 0.8;
        }else {
            destination = "Europe";
            sleepType = "Hotel";
            spendMoney = budget * 0.9;
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", sleepType, spendMoney);
    }
}
