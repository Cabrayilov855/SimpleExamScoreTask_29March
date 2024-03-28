import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = getRequiredText("Enter your name: ");
        int point;
        do {
            point = getRequiredNumber("Enter your point: ");
            if (point < 0 || point > 100) {
                System.out.println("Point is not correct. Please re-enter point");
            }
        } while (point < 0 || point > 100);

            if (point >= 91) {
                System.out.println("Your lesson result : A");
            } else if (point >= 81) {
                System.out.println("Your lesson result : B");
            } else if (point >= 71) {
                System.out.println("Your lesson result : C");
            } else if (point >= 61) {
                System.out.println("Your lesson result : D");
            } else if (point >= 51) {
                System.out.println("Your lesson result : E");
            } else {
                System.out.println("I'm very sorry, but your score is very low. Your result : F");
            }
        }

    static Scanner sc = new Scanner(System.in);

    public static int getRequiredNumber(String text) {
        System.out.println(text);
        return sc.nextInt();
    }

    public static String getRequiredText(String text) {
        System.out.println(text);
        return sc.next();
    }
}