package arr;

import java.util.Scanner;

public class knight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Knight position letter (e.g A)");
        char letter = in.next().charAt(0);
        System.out.println("Enter Knight position index (e.g 1)");
        int index = in.nextInt();

        System.out.println("Enter new position letter(e.g B)");
        char new_letter = in.next().charAt(0);
        System.out.println("Enter new Knight position index (e.g 3)");
        int new_index = in.nextInt();

        if ( isFieldOnTheDesk(index, letter) && isFieldOnTheDesk(new_index, new_letter) &&
                isKnightMovement(index, letter, new_index, new_letter) ) {
            System.out.println("This is possible movement");
        } else {
            System.out.println("This is impossible movement");
        }
    }

    private static boolean isFieldOnTheDesk(int index, int letter) {
        if ( (letter >= 65 && letter <= 72) || (letter >= 97 && letter <= 104) && (index >= 1 && index <= 8) ) {
            return true;
        } else return false;
    }

    private static boolean isKnightMovement(int index, int letter, int new_index, int new_letter) {
        if ( (Math.abs(index - new_index) == 1 && Math.abs(letter - new_letter) == 2) ||
                (Math.abs(index - new_index) == 2 && Math.abs(letter - new_letter) == 1) ) {
            return true;
        } else return false;
    }
}
