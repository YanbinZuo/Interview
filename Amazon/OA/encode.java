public class Main {
    public static void main(String[] args) {
        String s = "1226#24#";
        int[] nums = encode(s);
        for(int i = 0; i < 26; i++){
            System.out.println(nums[i]);
        }
    }
    
    public static int[] encode(String s){
        Map<Integer, Integer>map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            int num = 0;
            if(i+2 < s.length() && s.charAt(i+2)=='#'){
                num = Integer.parseInt(s.substring(i, i+2));
                i=i+2;
            }else{
                num = s.charAt(i) - '0';
            }
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int[] nums = new int[26];
        for(int i = 0; i < 26; i++){
            nums[i] = map.getOrDefault(i+1, 0);
        }
        return nums;
    }
}
