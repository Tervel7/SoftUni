package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());

        int hourArrived = Integer.parseInt(scanner.nextLine());
        int minutesArrived = Integer.parseInt(scanner.nextLine());

        int examTotalMinutes = hourExam * 60 + minutesExam;
        int arrivedTotalMinutes = hourArrived * 60 + minutesArrived;

        int diff = Math.abs(examTotalMinutes - arrivedTotalMinutes);

        if (arrivedTotalMinutes > examTotalMinutes){
            System.out.println("Late ");

            if (diff < 60){
                System.out.printf("%d minutes after the start", diff);
            }else {
                int hours = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }

        } else if (diff <= 30){
            System.out.printf("On time ");

            if (arrivedTotalMinutes != examTotalMinutes) {
                System.out.printf("%d minutes before the start", diff);
            }

        } else {
            System.out.printf("Early ");

            if (diff < 60){
                System.out.printf("%d minutes before the start", diff);
            }else {
                int hours = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            }
        }
    }
}
