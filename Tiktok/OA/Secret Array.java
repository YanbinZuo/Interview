public static int countAnalogousArrays(List<Integer> consecutiveDifference, int lowerBound, int upperBound) {
 
   int count = 0, max = 0, min = 0;
   for(int i: consecutiveDifference){
      count += i;
      max = Math.max(max, count);
      min = Math.min(min, count);
   }

   return Math.max(0, (upperBound-lowerBound) - (max-min)+1)

}
