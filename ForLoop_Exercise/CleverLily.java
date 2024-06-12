package ForLoop_Exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = scanner.nextInt();
        double washingMachinePrice = scanner.nextDouble();
        int toyPrice = scanner.nextInt();

        int toyCount = 0;
        int moneyCounter = 0;

        int evenBirthdays = 0;

        for (int i = 1; i <= years; i++) {
            if(i%2==0) {
                evenBirthdays++;
                moneyCounter += (evenBirthdays * 10)-1;
            } else
                toyCount++;
        }

        moneyCounter += toyCount * toyPrice;

        if(moneyCounter>=washingMachinePrice)
            System.out.printf("Yes! %.2f", (moneyCounter-washingMachinePrice));
        else
            System.out.printf("No! %.2f", (washingMachinePrice-moneyCounter));
    }
}
