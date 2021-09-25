// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int[] collection1 = {2, 4, 5};
        int d1 = 7;
        //int[] collection = {12, 8, 6, 4};
        // int[] collection = {4, 6, 12, 8};
        int[] collection2 = {4, 6, 8, 12};
        int d2= 14;
        int[] collection = {1, 2, 3, 4};
        int d= 20;
        int[] num = hackerCards(collection, d);
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }
    
     public static int[] hackerCards(int[] collection, int budget){
         Arrays.sort(collection);
        List<Integer> result = new ArrayList<>();
        int small, large;
        for(int i = 0; i <= collection.length; i++) {
            if (i == 0) small = 1; 
            else small = collection[i-1] + 1;
            
            if (i != collection.length) large = collection[i]; 
            else large = Integer.MAX_VALUE;
            
            if (budget < small) break;
            for (int j = small; j < large; j++) {
                if (j <= budget) {
                    result.add(j);
                    budget -= j;
                } else {
                    break;
                }
            }
        }

        return result.stream().mapToInt(i->i).toArray();
     }
}
