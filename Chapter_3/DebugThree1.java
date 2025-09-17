// This class figures out the tip for a waiter/waitress
// by calculating 15% of the bill amount
import java.util.Scanner;

public class DebugThree1 {
    public static void main(String[] args) {
        double check1;
        double check2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of your check >> ");
        check1 = input.nextDouble(); // Switched from nextInt() to nextDouble() so it can handle decimals

        System.out.print("Enter the amount of your friend's check >> ");
        check2 = input.nextDouble(); // Fixed typo, changed 'inputnextInt()' to 'input.nextDouble()'

        calcTip(check1); 
        calcTip(check2);
    }

    // Added a parameter 'bill' so the method can use the input value
    public static void calcTip(double bill) {
        final double RATE = 0.15; // Corrected typo from 'doubel' to 'double'
        double tip;
        tip = bill * RATE; // Fixed the formula; it should multiply by RATE, not divide
        System.out.println("The tip should be at least $" + tip);
    }
}