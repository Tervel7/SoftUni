package WhileLoop_Exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poorGradesCount = 0;
        int allGrades = 0;
        int allGradesCount = 0;
        int taskCounter = 0;
        String lastTask = "";

        int maxPoorGradesCount = Integer.parseInt(scanner.nextLine());

        String line = scanner.nextLine();

        while(true) {

            if(line.equals("Enough")) {
//                System.out.println("Average score: " + (double)(allGrades*1.0/allGradesCount));
                System.out.printf("Average score: %.2f\n", (allGrades*1.0/allGradesCount));
                System.out.println("Number of problems: " + taskCounter);
                System.out.println("Last problem: " + lastTask);
                break;
            }

            int currGrade = Integer.parseInt(scanner.nextLine());
            allGrades += currGrade;
            allGradesCount++;
            taskCounter++;
            lastTask = line;

            if(currGrade<=4){
                poorGradesCount++;
            }

            if (poorGradesCount>=maxPoorGradesCount) {
                System.out.println("You need a break, " + poorGradesCount + " poor grades.");
                break;
            }

            line = scanner.nextLine();
        }
    }
}
