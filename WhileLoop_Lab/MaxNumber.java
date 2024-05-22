package WhileLoop_Lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;
        String line = scanner.nextLine();

        while (!line.equals("Stop")) {
            int number = Integer.parseInt(line);
            if (number > maxNumber) {
                maxNumber = number;
            }

            line = scanner.nextLine();
        }

        System.out.println(maxNumber);
    }
}
