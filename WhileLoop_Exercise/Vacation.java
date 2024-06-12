package WhileLoop_Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moneyNeeded = Integer.parseInt(scanner.nextLine());
        int currentMoney = Integer.parseInt(scanner.nextLine());

        int daysCounter = 0;

        String command  = scanner.nextLine();

        while (true) {
            daysCounter++;

            if (command.equals("save")) {
                currentMoney += Integer.parseInt(scanner.nextLine());
            }

            if(command.equals("spend")) {
                currentMoney -= Integer.parseInt(scanner.nextLine());
                if(currentMoney<0)
                    currentMoney=0;
            }

            if(daysCounter>=5){
                System.out.println("You can't save the money.");
                System.out.println(daysCounter);
                break;
            }

            if(currentMoney>=moneyNeeded) {
                System.out.println("You saved the money for " + daysCounter + " days.");
                break;
            }

            command = scanner.nextLine();

        }

    }
}
