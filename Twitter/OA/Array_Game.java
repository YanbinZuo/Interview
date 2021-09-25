// 3. Array Game
// resource: https://www.geeksforgeeks.org/minimum-number-increment-operations-make-array-elements-equal
class minOperation{
   /* Function to print minimum operation required
       to make all elements of an array equal */
   static void printMinOp(int arr[]){
      int sum = 0;
      int min = arr[0];
      int op = 0;
      int n = arr.length;
      for(int i=0; i<n; i++){
         sum += arr[i];
         if(arr[i] < min){
            min = arr[i];
         }
      }
      op = sum - n*min;
      System.out.println("Minimum operation = " + op);
   }
   
   public static void main(String[] args){
      int arr[] = {5,6,2,4,3};
      printMinOp(arr);
      int arr1[] = {3,4,6,6,3};
      printMinOp(arr1);
   }

} 
