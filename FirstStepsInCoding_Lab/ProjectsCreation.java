package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int timeToCreate = projects * 3;
        // The architect George will need 12 hours to complete 4 project/s.
        System.out.println("The architect " + name + " will need " + timeToCreate + " hours to complete " + projects + " project/s.");
    }
}
