public class Main {
    public static void main(String[] args) {
        //String s = "abab";
        // String s = "aaaa";
        String s = "abcdefg";
        int num = getMinDeletions(s);
        System.out.println(num);
    }
    
    public static int getMinDeletions(String s){
        int count = 0;
        int size = s.length();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < size; i++){
            if(set.contains(s.charAt(i))){
                count++;
            }else{
                set.add(s.charAt(i));
            }
        }
        return count;
    }
}
