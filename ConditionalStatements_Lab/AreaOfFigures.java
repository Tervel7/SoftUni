package ConditionalStatements_Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        if(figure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println(a * a);
        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println(a*b);
        } else if(figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            System.out.println(Math.PI * radius * radius);
        } else {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            System.out.println(0.5 * a * h);
        }
    }
}
