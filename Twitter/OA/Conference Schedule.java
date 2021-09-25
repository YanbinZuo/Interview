public class Main {
    public static void main(String[] args) {
        // int[] scheduleStart = {1, 1, 2};
        // int[] scheduleEnd = {3, 2, 4};
        int[] scheduleStart = {1, 1, 2, 3};
        int[] scheduleEnd = {2, 3, 3, 4};
        int num = maxPresentations(scheduleStart, scheduleEnd);
        System.out.println(num);
    }
    
    public static int maxPresentations(int[] scheduleStart, int[] scheduleEnd){
        List<meeting> list = store(scheduleStart, scheduleEnd);
        int res = 1;
        int limit = list.get(0).end;
        for(int i = 1; i < list.size(); i++){
            if(list.get(i).start >= limit){
                res++;
                limit = list.get(i).end;
            }
        }
        return res;
    }
    
    public static List<meeting> store(int[] scheduleStart, int[] scheduleEnd){
        List<meeting> list = new ArrayList<>();
        for(int i = 0; i < scheduleStart.length; i++){
            list.add(new meeting(scheduleStart[i], scheduleEnd[i]));
        }
        mycomparator mc = new mycomparator();
        Collections.sort(list, mc);
        return list;
    }
}

class mycomparator implements Comparator<meeting>{
    @Override
    public int compare(meeting o1, meeting o2){
        if(o1.end < o2.end)
        {
            return -1;
        }
        else if(o1.end > o2.end){
            return 1;
        }
        return 0;
    }
}

class meeting{
    int start;
    int end;
    
    meeting(int start, int end){
        this.start = start;
        this.end = end;
    }
}
