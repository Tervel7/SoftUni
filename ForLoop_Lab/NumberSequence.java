package ForLoop_Lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersCount = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i =0;i<numbersCount;i++) {
            int currNum = Integer.parseInt(scanner.nextLine());
            if(currNum>=max)
                max = currNum;
            if (currNum<=min)
                min = currNum;
        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}
