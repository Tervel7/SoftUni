package Exam;

import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        String souvenir = scanner.nextLine();
        int souvenirCount = Integer.parseInt(scanner.nextLine());

        switch (team) {
            case "Argentina":
                switch (souvenir) {
                    case "flags":
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, team, souvenirCount*3.25);
                        break;
                    case "caps":
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, team, souvenirCount*7.2);
                        break;
                    case "posters":
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, team, souvenirCount*5.1);
                        break;
                    case "stickers":
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, team, souvenirCount*1.25);
                        break;
                    default:
                        System.out.println("Invalid stock!");
                }
                break;
            case "Brazil":
                switch (souvenir) {
                    case "flags":
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, team, souvenirCount*4.2);
                        break;
                    case "caps":
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, team, souvenirCount*8.5);
                        break;
                    case "posters":
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, team, souvenirCount*5.35);
                        break;
                    case "stickers":
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, team, souvenirCount*1.2);
                        break;
                    default:
                        System.out.println("Invalid stock!");
                }
                break;
            case "Croatia":
                switch (souvenir) {
                    case "flags":
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, team, souvenirCount*2.75);
                        break;
                    case "caps":
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, team, souvenirCount*6.9);
                        break;
                    case "posters":
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, team, souvenirCount*4.95);
                        break;
                    case "stickers":
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, team, souvenirCount*1.1);
                        break;
                    default:
                        System.out.println("Invalid stock!");
                }
                break;
            case "Denmark":
                switch (souvenir) {
                    case "flags":
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, team, souvenirCount*3.1);
                        break;
                    case "caps":
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, team, souvenirCount*6.5);
                        break;
                    case "posters":
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, team, souvenirCount*4.8);
                        break;
                    case "stickers":
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, team, souvenirCount*0.9);
                        break;
                    default:
                        System.out.println("Invalid stock!");
                }
                break;
            default:
                System.out.println("Invalid country!");
        }
    }
}
