public class Main{
    public static void main(String[] args){      
       int[] numbers = {6, 2, 4, 10};
       closestNumbers(numbers);
    }

    public static void closestNumbers(int[] numbers){
        Arrays.sort(numbers);
        int slow = numbers[0];
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i < numbers.length; i++){
            min = Math.min(min, numbers[i]-slow);
            if(numbers[i]-slow < min){
                min = numbers[i]-slow;
                map = new HashMap<>();
                map.put(slow, numbers[i]);
            }else if(numbers[i]-slow == min){
                map.put(slow, numbers[i]);
            }
            slow = numbers[i];
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}
