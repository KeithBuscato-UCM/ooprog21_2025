class StringBuilderDemo{
   public static void main(String[] args){
   String nameString = "Barbara"; 
   StringBuilder ns = new StringBuilder("Barbara");
   String addressString = "6311 Hickory Nut Grove Road";
   StringBuilder as = new StringBuilder(addressString);
   
   System.out.println("(StringBuilder 1) nameString: "+ nameString);
   System.out.println("Capacity of nameString is: " +ns.capacity());
   
   System.out.println("(StringBuilder 2) addressString: "+ addressString);
   System.out.println("Capacity of nameString is: " + as.capacity());
   
   ns.setLength(20);
   as.setLength(20);
   
   System.out.println("(Length set to 20 for StringBuilder 1) the name is " + ns + "end");
   System.out.println("(Length set to 20 for StringBuilder 2) the address is " + as);   
   }
}
