package ConditionalStatements_Exercise;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalTimeInMinutes = (hours*60) + minutes + 15;

        if(totalTimeInMinutes%60==0)
            System.out.println(totalTimeInMinutes/60+":00");
        else {
            System.out.print(totalTimeInMinutes/60==24? "0:": totalTimeInMinutes/60 + ":");
            System.out.println(totalTimeInMinutes%60<9? "0"+totalTimeInMinutes%60 : totalTimeInMinutes%60);
        }
    }
}
