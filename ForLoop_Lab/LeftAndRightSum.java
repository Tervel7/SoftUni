package ForLoop_Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = Integer.parseInt(scanner.nextLine());

        int sum1 = 0;
        int sum2 = 0;

        for(int i=0; i<counter; i++) {
            sum1 += Integer.parseInt(scanner.nextLine());
        }

        for(int i=0; i<counter; i++) {
            sum2 += Integer.parseInt(scanner.nextLine());
        }

        if(sum1==sum2)
            System.out.println("Yes, sum = " + sum1);
        else
            System.out.println("No, diff = " + (sum1>sum2? sum1-sum2 : sum2-sum1));
    }
}
