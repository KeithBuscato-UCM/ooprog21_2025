import java.util.Scanner;
class CompareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name > ");
        String name = input.nextLine();
        StringBuilder sb = new StringBuilder(name);

            String result = name.substring(0, 1).toUpperCase() 
            + name.substring(1);
            
            if(sb.toString().equals(result)){
                System.out.println(result + " is equal to " + sb);
            }
            else{
                System.out.println(result + " is not equal to " + sb);
            }
    }
}
