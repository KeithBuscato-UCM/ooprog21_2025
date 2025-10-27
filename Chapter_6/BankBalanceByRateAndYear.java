import java.util.*;
class BankBalanceByRateAndYear{
   public static void main(String[] args){
      double Balance;
      double InterestRate = 0.02;
      int Year;
      double TempBalance;
      Scanner scn = new Scanner(System.in);
      System.out.print("Enter Initial bank balance > ");
      Balance = scn.nextDouble();
      System.out.println("");
      
      for(int i=1;i<=4;i++){
         TempBalance = Balance;
         Year = 1;
         System.out.println("With an initial balance of $"+ Balance +" at an interest rate of "+InterestRate);
         for(int j=1;j<=4;j++){
            TempBalance += TempBalance * InterestRate;
            System.out.println("After year "+Year+" balance is $" +TempBalance);
            Year++;
         }
         InterestRate += 0.01;
         System.out.println("");
      }  
   }
}