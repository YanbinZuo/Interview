// leetcode: 1048
class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        int[] dp = new int[words.length];
        int res = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if(predecessor(words[i], words[j])){
                    dp[j] = Math.max(dp[j], dp[i]+1);
                    res = Math.max(res, dp[j]);
                }
            }
        }
        return res+1;
    }
    
    private boolean predecessor(String a, String b){
        if(a.length()+1 != b.length())return false;
        int i = 0;
        int j = 0;
        while(i < a.length() && j < b.length()){
            if(a.charAt(i) == b.charAt(j))i++;
            j++;
        }
        return i == a.length();
    }
}
