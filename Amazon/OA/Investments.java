public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[][] nums = {{1,2,10},{2,4,5},{3,5,12}};
        cal(n, nums);
        //System.out.println(cal(n, nums));
    }
    
    public static int cal(int n, int[][] nums){
        int[] arr = new int[n];
        for(int i = 0; i < nums.length; i++){
            int start = nums[i][0]-1;
            int end = nums[i][1]-1;
            int contri = nums[i][2];
            arr[start] += contri;
            if(end+1 < n)arr[end+1] -= contri;
            printArray(arr);
        }
        for(int i = 1; i < n; i++){
            arr[i] = arr[i-1]+arr[i];
        }
        int max = 0;
        for(int i = 1; i < n; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
