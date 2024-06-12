package WhileLoop_Lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSum = 0;
        String command = scanner.nextLine();
        while (!command.equals("NoMoreMoney")) {
            double sum = Double.parseDouble(command);

            if (sum < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f%n", sum);
            totalSum += sum;

            command = scanner.nextLine();
        }

        System.out.printf("Total: %.2f", totalSum);
    }
}
