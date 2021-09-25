public class Main{
     public static void main(String[] args){
         String[] logs = {"88 99 200", "88 99 300", "99 32 100", "12 12 15"};
         int threshold = 2;
         String[] str = processLogs(logs, threshold);
         for(int i = 0; i < str.length; i++){
             System.out.println(str[i]);
         }
     }
     public static String[] processLogs(String[] logs, int threshold){        
          Map<String, Integer> map = new HashMap<>();
          for (int i = 0; i < logs.length; i++){
               String[] tokens = logs[i].split(" ");
               String sender = tokens[0];
               String recipient = tokens[1];
               map.put(sender, map.getOrDefault(sender, 0) + 1);
               if(!sender.equals(recipient)) map.put(recipient, map.getOrDefault(recipient, 0) + 1);
          }
          List<String> list = new ArrayList<>();       
          for (Map.Entry<String,Integer> entry : map.entrySet()){
               if(entry.getValue() >= threshold)list.add(entry.getKey());
          }
          Collections.sort(list);
          String res[] = new String[list.size()];
          for(int i =0; i<list.size(); i++){        
               res[i] = list.get(i)+"";
          }
          return res;
     }
}
