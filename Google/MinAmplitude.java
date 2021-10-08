import java.util.*;
// "static void main" must be defined in a public class.
class Main {
    public static void main(String[] args) {
        // int[] nums = {-1, 3, -1, 8, 5, 4};
        int[] nums = {10,10,3,4,10};
        minAmplitude a = new minAmplitude();
        System.out.println(a.minAmplitude(nums));
    }
}

class minAmplitude{
    public int minAmplitude(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;        
        int ans = nums[n-1] - nums[0];
        if(n <= 3) return ans;
        for(int i=0, j=n-4; j<n; i++, j++){
            ans = Math.min(ans, nums[j] - nums[i]);
        }
        return ans;
    }
}