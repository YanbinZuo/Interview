// 3. Array Game
// resource: https://www.geeksforgeeks.org/minimum-number-increment-operations-make-array-elements-equal
class minOperation{
   /* Function to print minimum operation required
       to make all elements of an array equal */
   public static long printMinOp(int arr[]){
      int min = Integer.MAX_VALUE;
      int sum = 0;
      int res = 0;
      for(int i=0; i<arr.length; i++){
         sum += arr[i];
         min = Math.min(min, arr[i]);
      }
      res = sum - arr.length*min;
      return res;
   }
   
   public static void main(String[] args){
      int arr[] = {5,6,2,4,3};
      long res1 = printMinOp(arr);
      int arr1[] = {3,4,6,6,3};
      long res = printMinOp(arr1);
      System.out.println(res1);
   }
} 
