package ConditionalStatements_Exercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstRunnerSeconds = Integer.parseInt(scanner.nextLine());
        int secondRunnerSeconds = Integer.parseInt(scanner.nextLine());
        int thirdRunnerSeconds = Integer.parseInt(scanner.nextLine());

        int totalTimeSeconds = firstRunnerSeconds+secondRunnerSeconds+thirdRunnerSeconds;

        if (totalTimeSeconds%60==0)
            System.out.println(totalTimeSeconds/60 + ":00");
        else {
            System.out.print(totalTimeSeconds/60 + ":");
            System.out.println(totalTimeSeconds%60<9? "0"+totalTimeSeconds%60 : totalTimeSeconds%60);
        }
    }
}
