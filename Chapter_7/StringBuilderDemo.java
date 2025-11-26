class StringBuilderDemo{
   public static void main(String[] args){
   StringBuilder nameString = new StringBuilder("Barbara");
   StringBuilder addressString = new StringBuilder("6311 Hickory Nut Grove Road");
   
   System.out.println("(StringBuilder 1) nameString: "+ nameString);
   System.out.println("Capacity of nameString is: " +nameString.capacity());
   
   System.out.println("(StringBuilder 2) addressString: "+ addressString);
   System.out.println("Capacity of nameString is: " + addressString.capacity());
   
   nameString.setLength(20);
   addressString.setLength(20);
   
   System.out.println("(Length set to 20 for StringBuilder 1) the name is " + nameString + "end");
   System.out.println("(Length set to 20 for StringBuilder 2) the address is " + addressString);   
   }
}