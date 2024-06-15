package Exam;

import java.util.Scanner;

public class Proccessors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int processorsToBeMade = Integer.parseInt(scanner.nextLine());
        int employees = Integer.parseInt(scanner.nextLine());
        int workingDays = Integer.parseInt(scanner.nextLine());

        int expensesForWorkers = employees * workingDays * 8;
        double processorsMade = Math.floor(expensesForWorkers/3);

        if(processorsMade>=processorsToBeMade) {
            double profit = (processorsMade-processorsToBeMade) * 110.10;
            System.out.printf("Profit: -> %.2f BGN", profit);
        } else {
            double loses = (processorsToBeMade-processorsMade) * 110.10;
            System.out.printf("Losses: -> %.2f BGN", loses);
        }
    }
}
