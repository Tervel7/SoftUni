package WhileLoop_Lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;
        String line = scanner.nextLine();

        while (!line.equals("Stop")) {
            int number = Integer.parseInt(line);
            if (number < minNumber) {
                minNumber = number;
            }

            line = scanner.nextLine();
        }

        System.out.println(minNumber);
    }
}
