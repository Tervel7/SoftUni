package WhileLoop_Lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();
        String currentPass = scanner.nextLine();

        while (!currentPass.equals(password)) {
            currentPass = scanner.nextLine();
        }
        System.out.printf("Welcome " + username);
    }
}
