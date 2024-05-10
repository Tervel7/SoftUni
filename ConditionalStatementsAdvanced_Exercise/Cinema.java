package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        double income = switch (projection) {
            case "Premiere" -> r * c * 12.00;
            case "Normal" -> r * c * 7.50;
            case "Discount" -> r * c * 5.00;
            default -> 0;
        };

        System.out.printf("%.2f leva", income);
    }
}
