public class Main{
   public static void main(String[] args){      
      String[] strs = {"listen", "silent", "it", "is"};
      String[] sentences = {"listen it is silent", "listen it is listen silent"};
      int[] numOfSen = countSentences(strs, sentences);
      for(int i=0; i<numOfSen.length; i++){
         System.out.print(numOfSen[i] + " ");
      }
   }
   
   private static int[] countSentences(String wordSet[], String sentences[]){
      int[] res = new int[sentences.length];
      Arrays.fill(res, 1);
      Map<String, Integer> map = groupAnagrams(wordSet);
      for(int i = 0; i < sentences.length; i++){
          String[] tokens = sentences[i].split(" ");
          for(String word : tokens){
            char[] carr = word.toCharArray();
            Arrays.sort(carr);
            String key = new String(carr);           
            res[i] *=  map.get(key);   
          }
      }
      return res;
   }
   
   private static Map<String, Integer> groupAnagrams(String[] strs){
      if(strs.length == 0) return new HashMap<>();
      Map<String, Integer> map = new HashMap<>();
      for(String str: strs){
         char[] carr = str.toCharArray();
         Arrays.sort(carr);
         String key = new String(carr);
         map.put(key, map.getOrDefault(key, 0)+1);
      }
      return map;
   }
}
