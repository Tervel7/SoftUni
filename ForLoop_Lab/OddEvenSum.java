package ForLoop_Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = Integer.parseInt(scanner.nextLine());

        int sumEven = 0;
        int sumOdd = 0;

        for (int i=0; i<counter; i++) {
            int currNum = Integer.parseInt(scanner.nextLine());
            if(i%2==0)
                sumEven += currNum;
            else
                sumOdd += currNum;
        }
        if(sumEven==sumOdd) {
            System.out.println("Yes");
            System.out.println("Sum = " + sumEven);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + (sumEven>sumOdd? sumEven-sumOdd : sumOdd-sumEven));
        }
    }
}
