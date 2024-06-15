package Exam;

import java.util.Scanner;

public class GiftsFromSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int blackPoint = Integer.parseInt(scanner.nextLine());

        for (int i = end; i >= start; i--) {
            if(i%2==0 && i%3==0)
                if (i==blackPoint)
                    break;
                else
                    System.out.print(i + " ");
        }
    }
}
