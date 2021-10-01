public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, -4, 5, 10};
        int[] res = monotonic(arr);
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }
    
    public static int[] monotonic(int[] arr){
        int[] res = new int[arr.length-2];
        int index = 0;
        for(int i = 0; i < arr.length-2; i++){
            if((arr[i] > arr[i+1]) && (arr[i+1] > arr[i+2])){
                res[index] = 1;
            }else if(arr[i] < arr[i+1] && arr[i+1] < arr[i+2]){
                res[index] = 1;
            }else{
                res[index] = 0;
            }
            index++;
        }
        return res;
    }
}
