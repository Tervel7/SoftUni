package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int monthInterval = Integer.parseInt(scanner.nextLine());
        double annualInterest = Double.parseDouble(scanner.nextLine());

        double amountToBePaid = deposit + (monthInterval * ((deposit * annualInterest/100)/12));

        System.out.println(amountToBePaid);
    }
}
