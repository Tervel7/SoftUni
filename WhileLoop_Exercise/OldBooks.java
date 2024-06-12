package WhileLoop_Exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchedBook = scanner.nextLine();
        String currentBook = scanner.nextLine();
        int bookCount = 0;

        while(true) {
            if(currentBook.equals("No More Books")){
                System.out.println("The book you search is not here!");
                System.out.println("You checked " + bookCount + " books.");
                break;
            }
            bookCount++;
            if(currentBook.equals(searchedBook)){
                System.out.println("You checked " + (bookCount-1) +" books and found it.");
                break;
            }

            currentBook = scanner.nextLine();
        }
    }
}
