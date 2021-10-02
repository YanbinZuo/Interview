class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>>map = new HashMap<>();
        for(int[] m : adjacentPairs){
            map.putIfAbsent(m[0], new ArrayList<Integer>());
            map.putIfAbsent(m[1], new ArrayList<Integer>());
            map.get(m[0]).add(m[1]);
            map.get(m[1]).add(m[0]);
        }
        
        int[] ret = new int[adjacentPairs.length+1];
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            if(entry.getValue().size() == 1){
                ret[0] = entry.getKey();
                break;
            }
        }
        ret[1] = map.get(ret[0]).get(0);
        for(int i = 2; i < ret.length; i++){
            List<Integer> adj =map.get(ret[i-1]);
            ret[i] = ret[i-2] == adj.get(0) ? adj.get(1) : adj.get(0);
        }
        return ret;
    }
}
