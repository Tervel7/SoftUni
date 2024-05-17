package ForLoop_Lab;

import java.util.Scanner;

public class NumbersNTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = num; i>=1; i--)
            System.out.println(i);
    }
}