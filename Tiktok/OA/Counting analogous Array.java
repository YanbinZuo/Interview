// https://leetcode.com/discuss/interview-question/1332322/amazon-online-assessment-july-2021-secret-array
public static int countAnalogousArrays(List<Integer> consecutiveDifference, int lowerBound, int upperBound) {
 
   int count = 0, max = 0, min = 0;
   for(int i: consecutiveDifference){
      count += i;
      max = Math.max(max, count);
      min = Math.min(min, count);
   }

   return Math.max(0, (upperBound-lowerBound) - (max-min)+1)

}


public static int countAnalogousArrays(List<Integer> consecutiveDifference, int lowerBound, int upperBound) {
 
   int count = 0;
   long max = lowerBound;
   long min = lowerBound;
   long prev= lowerBound;
   long curr = 0;
   for(int i = 1; i <= consectutiveDifference.size(); i++){
       curr = prev - consecuiveDifference.get(i-1);
        min = Math.min(min, curr);
        max = Math.max(max, curr);
        prev = cur;
   }
   while(max <= upperBound){
       if(min >= lowerBound)count++;
       min = min+1l
       max = max+1;
   }
   return count;
}
