import java.util.Scanner;
public class BankBalance {
    public static void main(String[] args) {
        double Balance;
        double InterestRate = 0.03;
        int Choice;
        int Year = 1;
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        Balance = in.nextDouble();

        System.out.println("Do you want to see next year's balance?");
        System.out.print("Enter 1 for yes or any other number for no >> ");
        Choice = in.nextInt();

        while (Choice == 1) {
            Balance += Balance * InterestRate;
            System.out.println("After year " + Year + " at " + InterestRate + " interest rate, balance is $" + Balance);
            System.out.println();
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            Choice = in.nextInt();
            Year++;
        }
    }
}