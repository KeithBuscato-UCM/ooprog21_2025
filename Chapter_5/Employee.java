class Employee {
   int employeeNumber;
   double payRate;
   double hoursWorked;
   double overtimeHours;
   
   public static final int MAX_EMPLOYEE_NUMBER = 9999;
   public static final double MAX_RATE = 60.0;
   public static final double OVERTIME_MULTIPLIER = 1.5;
   public static final int STANDARD_HOURS = 40;
   
   Employee(){
   //default constructor
   }
   
   //Constructor with parameters
   Employee(double payRate, double hoursWorked){
   this.payRate = payRate;
   this.hoursWorked = hoursWorked;
   }
   
   //getters
   public double getPayRate(){
      return payRate;
   }
   public double getHoursWorked(){
      return hoursWorked;
   }
   
   // calculate regular pay (only up to 40 hours, because of the standard)
   public double getRegularPay(double hoursWorked){
      if(hoursWorked > STANDARD_HOURS)
         return STANDARD_HOURS * payRate;
      else
         return hoursWorked * payRate;
   }
   // calculate overtime pay
   public double getOvertimePay(double hoursWorked){
      if(hoursWorked > STANDARD_HOURS)
      {
         double overtimeHours = hoursWorked - STANDARD_HOURS;
         return overtimeHours * (payRate * OVERTIME_MULTIPLIER);
      }
      else
         return 0;
   }
}