public class DemoGrossPay{
    public static void main(String[] args){
        calculateGross(10.0, 22.75);
        calculateGross(25.0, 22.75);
        calculateGross(37.5, 22.75);
        }

    public static void calculateGross(double Hours, double PerHour){
        double TotalPayment = Hours * PerHour;
        System.out.println(Hours+ " hours at $" +PerHour+" per hour is $"+TotalPayment);
    }
}