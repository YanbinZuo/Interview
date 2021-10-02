public class Main {
    public static void main(String[] args) {
        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] words = {"abc", "gdef", "x"};
        List<Boolean> list = pushButton(digits, words);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    
    public static List<Boolean> pushButton(int[] digits, String[] words){
        List<Boolean> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < digits.length; i++){
            set.add(digits[i]);
        }
        for(String word: words){
            Boolean temp = true;
            for(int i = 0; i < word.length(); i++){
                int num = 2 + (word.charAt(i) - 'a' + 0) / 3;
                if(!set.contains(num)){
                    temp = false;
                    list.add(temp);
                }
            }
            if(temp)list.add(temp);
        }
        return list;
    }
}
