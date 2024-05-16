package ForLoop_Lab;

import java.util.Scanner;

public class Numbers1ToN3Steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i=1; i<=num;i+=3) {
            System.out.println(i);
        }
    }
}
