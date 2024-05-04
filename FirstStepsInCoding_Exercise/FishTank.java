package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthCm = Integer.parseInt(scanner.nextLine());
        int widthCm = Integer.parseInt(scanner.nextLine());
        int heightCm = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double aquariumVolume = lengthCm * widthCm * heightCm;
        double neededLites = (aquariumVolume/1000) * (1-percent/100);

        System.out.println(neededLites);
    }
}
