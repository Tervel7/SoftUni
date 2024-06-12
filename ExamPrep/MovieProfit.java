package ExamPrep;

import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int percentForTheCinema = Integer.parseInt(scanner.nextLine());

        double profitFromMovieNoTaxes = (tickets * ticketPrice) * days;
        double profitFromTheMovie = profitFromMovieNoTaxes - (profitFromMovieNoTaxes * (percentForTheCinema*0.01));

        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, profitFromTheMovie);
    }
}
