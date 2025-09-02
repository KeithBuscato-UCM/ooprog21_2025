class TableAndChairs{
   public static void main(String[] args){
      
      for(int i=1; i<=7; i++){
         for(int j=1; j<=13; j++){
              if((i<4)&&(j==1||j==13))//
              {
               System.out.print(" X ");
              }
              else if((i==4)&&(j==1||(j>=5 && j<=9)||j==13))//
              {
               System.out.print(" X ");
              }
              else if((i==5)&&(j<=3||j==5||j==9||j>=11))
              {
               System.out.print(" X ");
              }
              else if((i==6||i==7)&&(j==1||j==3||j==5||j==9||j==11||j==13))
              {
               System.out.print(" X ");
              }
              else
              {
               System.out.print("   ");
              }
         }
      System.out.println();
      }
   }
}