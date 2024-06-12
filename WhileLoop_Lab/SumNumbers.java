package WhileLoop_Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minimalSum = scanner.nextInt();
        int sum = 0;

        while(sum<minimalSum) {
            sum += scanner.nextInt();
        }
    }
}
