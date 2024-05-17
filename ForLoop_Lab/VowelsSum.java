package ForLoop_Lab;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int sum = 0;

        for (int i=0; i<line.length();i++) {
            if (line.charAt(i)=='a')
                sum+=1;
            else if (line.charAt(i)=='e')
                sum+=2;
            else if(line.charAt(i)=='i')
                sum+=3;
            else if(line.charAt(i)=='o')
                sum+=4;
            else if(line.charAt(i)=='u')
                sum+=5;
        }

        System.out.println(sum);
    }
}
