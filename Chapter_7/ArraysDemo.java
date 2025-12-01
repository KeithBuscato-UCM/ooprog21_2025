import java.util.*;
class ArraysDemo {

    public static void display(StringBuilder message, int array[]) {
        System.out.print(message);
        for (int n : array) {
            System.out.print(" " + n);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] numbers = {0, 0, 0, 0, 0};
        StringBuilder OArray = new StringBuilder("Original Array: ");
        StringBuilder AFilling = new StringBuilder("After filling with 8s: ");
        StringBuilder AChange = new StringBuilder("After changing two values: ");
        StringBuilder ASorting = new StringBuilder("After sorting: ");
        
        OArray.setLength(30);
        AFilling.setLength(30);
        AChange.setLength(30);
        ASorting.setLength(30);
        
        display(OArray, numbers); 

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 8;
        }
        display(AFilling, numbers);

        numbers[2] = 6;
        numbers[4] = 3;
        display(AChange, numbers);

        Arrays.sort(numbers);
        
        display(ASorting , numbers);
    }
}