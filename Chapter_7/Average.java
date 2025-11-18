class Average{
   public static void main(String args[]){

      // goal: count how many numbers are greater than the average of all previous numbers

      int[] responseTimes = {100, 200, 150, 300}; // given array of integers

      double sum = responseTimes[0]; // start with the first value (100)
      int prevCount = 1;             // we currently have 1 previous number
      int count = 0;                 // count of numbers that pass the condition

      // start at index 1 because index 0 has no previous average
      for (int i = 1; i < responseTimes.length; i++) {

         double avg = sum / prevCount; 
         // compute the average(avg) of all previous numbers(preCount)

         // check if the current number is greater than the previous average
         if (responseTimes[i] > avg) { 
            count++;
         }

         sum += responseTimes[i];  // update the sum
         prevCount++;              // update number of previous elements
      }

      System.out.println("Result: " + count);
   }
}