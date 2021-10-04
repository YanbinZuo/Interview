public class Main {
    public static void main(String[] args) {
        //int[] arr = {6, 3, 4, 5};
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr = {0, 0, 1, 1, 2, 3, 4, 9};
        int[] res =  Custon_SortedArray(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(res[i]);
        }
    }
    
    public static int[] Custon_SortedArray(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            while(left < right && arr[left] %2 == 0){
                left++;
            }
            while(left < right && arr[right] %2 != 0){
                right--;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        return arr;
    }
}
