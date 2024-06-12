package ForLoop_Exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int currNumber = scanner.nextInt();
            if(currNumber>max)
                max = currNumber;
            sum += currNumber;
        }

        if (max==sum-max)
            System.out.println("Yes \nSum = " + (sum-max));
        else
            System.out.println("No \nDiff = " + (max>(sum-max)? max-(sum-max) : (sum-max)-max));
    }
}
