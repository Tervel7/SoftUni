package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inch = scanner.nextDouble();
        double cm = inch * 2.54;

        System.out.println(cm);
    }
}
