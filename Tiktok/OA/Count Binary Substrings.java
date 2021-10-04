//leetcode: 696
class Solution {
    public int countBinarySubstrings(String s) {
        int last = 0;
        int ptr = 0;
        int res = 0;
        while(ptr < s.length()){
            int count = 0;
            char c = s.charAt(ptr);
            while(ptr < s.length() && s.charAt(ptr) == c){
                count++;
                ptr++;
            }
            res += Math.min(count, last);
            last = count;
        }
        return res;
    }
}
