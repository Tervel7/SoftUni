package ForLoop_Lab;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        for (int i=0; i<line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }
}
