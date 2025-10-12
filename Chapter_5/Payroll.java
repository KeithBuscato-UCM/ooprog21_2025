import java.util.*;
public class Payroll {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.print("How many hours did you work this week? ");
      double hoursWorked = in.nextDouble();
   
      System.out.print("What is your regular pay rate? ");
      double payRate = in.nextDouble();
      
      Employee employee1 = new Employee(payRate,hoursWorked);
      
      double regularPay = employee1.getRegularPay(hoursWorked);
      double overtimePay = employee1.getOvertimePay(hoursWorked);
      
      System.out.println("Regular pay is $" + regularPay);
      System.out.println("Overtime pay is $" + overtimePay);      
      
   }
}