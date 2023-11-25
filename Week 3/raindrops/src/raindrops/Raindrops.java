package raindrops;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Raindrops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        if (number % 3 == 0) {
            result.append("Pling");
        }
        if (number % 5 == 0) {
            result.append("Plang");
        }
        if (number % 7 == 0) {
            result.append("Plong");
        }
        if (result.length() == 0) {
            result.append(number);
        }
        System.out.println(result);
    }
    
}
