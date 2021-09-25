// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int n = 6;
        int[] bad = {37,22,15,49,60,7};
        int lower = 3;
        int upper = 48;
        System.out.println(cal(n, bad, lower, upper));
    }
    
    public static int cal(int n, int[] bad, int lower, int upper){
        if(lower>upper)return 0;
        Arrays.sort(bad);
        int max = 0;
        int left = lower;
        for(int i = 0; i < bad.length; i++){
            if(bad[i] < lower)continue;
            int right = bad[i]-1;
            if(bad[i] > upper)right = upper;
            System.out.println("i: "+bad[i]);
            if(left>right){
                left = bad[i]+1;
                continue;
            }
            max = Math.max(max, right - left+1);
            System.out.println("left: "+left);
            System.out.println("right: "+right);
            left = bad[i]+1;
        }
        
        return max;
    }
}
