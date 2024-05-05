package ConditionalStatements_Lab;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();

    //    System.out.println(grade>=5? "Excellent!" : "");

        if(grade>=5)
            System.out.println("Excellent!");
    }
}
