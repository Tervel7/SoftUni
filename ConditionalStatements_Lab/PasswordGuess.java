package ConditionalStatements_Lab;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

    //    System.out.println(password.equals("s3cr3t!P@ssw0rd")? "Welcome" : "Wrong password!");

        if(password.equals("s3cr3t!P@ssw0rd"))
            System.out.println("Welcome");
        else
            System.out.println("Wrong password!");
    }
}
