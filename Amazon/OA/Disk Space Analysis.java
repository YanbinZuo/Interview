//Example: 
//space = [8, 2, 4]
//x = 2, the length of analysis segments
//In this array of computers, the subarrays of size 2 are [8, 2] and [2, 4]. Thus, the initial analysis returns 2 and 2 because those are the minima for the segments. So, return the maximum of the minimum values of available hard disk found while analyzing the computers in segments of numComps

public class Main {
    public static void main(String[] args) {
        int x = 2;
        int[] space = {8, 2, 4};
        int result = segment(x, space);
        System.out.println(result);
    }
    
    // public static int segment(int x, int[] space){
    //     int size = space.length;
    //     int[] arr = new int[size-x+1];
    //     int index = 0;
    //     for(int i = 0; i <= size-x; i++){
    //         int min = Integer.MAX_VALUE;
    //         for(int j = i; j < size && j < i+x; j++){
    //             min = Math.min(min, space[j]);
    //         }
    //         arr[index] = min;
    //         index++;
    //     }
    //     Arrays.sort(arr);
    //     return arr[arr.length-1];
    // }
    
    public static int segment(int x, int[] space){
        Arrays.sort(space);
        return space[space.length-x];
    }
}
