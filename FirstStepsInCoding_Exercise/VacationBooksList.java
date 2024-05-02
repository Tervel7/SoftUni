package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bookPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysToRead = Integer.parseInt(scanner.nextLine());

        int readTime = (bookPages / pagesPerHour) / daysToRead;

        System.out.println(readTime);
    }
}
