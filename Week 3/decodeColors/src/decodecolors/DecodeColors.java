
package decodecolors;


import java.util.Scanner;

/**
 *
 * @author PC
 */
public class DecodeColors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the colors of the resistor: ");
        String input = scanner.nextLine();
        String[] colors = input.split("-");
        int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] bands = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int value = 0;
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < bands.length; j++) {
                if (colors[i].equalsIgnoreCase(bands[j])) {
                    value = value * 10 + values[j];
                }
            }
        
        System.out.printf("The value of the resistor is %02d ohms.\n", value);    }
}
}
