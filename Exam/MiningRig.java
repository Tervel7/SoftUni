package Exam;

import java.util.Scanner;

public class MiningRig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int videoCardPrice = Integer.parseInt(scanner.nextLine());
        int transitionerPrice = Integer.parseInt(scanner.nextLine());
        double electricityConsumptionPerDay = Double.parseDouble(scanner.nextLine());
        double profitPerDay = Double.parseDouble(scanner.nextLine());

        int totalBill = (videoCardPrice*13) + (transitionerPrice * 13) + 1000;
        System.out.println(totalBill);

        double netProfitTotal = 13 * (profitPerDay - electricityConsumptionPerDay);
        double daysBeforeMakingAProfit = totalBill / netProfitTotal;

        System.out.println((int)Math.ceil(daysBeforeMakingAProfit));
    }
}
