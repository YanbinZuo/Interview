public class Main {
    public static void main(String[] args) {
        String res = lastAndSecondlast("bat");
        System.out.println(res);
    }
    
    public static String lastAndSecondlast(String word){
        char last = word.charAt(word.length()-1);
        char secondLast = word.charAt(word.length()-2);
        String s = last + " " + secondLast;
        return s;
    }
}
