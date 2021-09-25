public class Main {
    public static void main(String[] args) {
        int[][] samples1 = {{1,1,1,1,1},{1,1,1,0,0},{1,1,1,0,0},{1,1,1,1,1}};
        int[][] samples2 = {{1,0,1},{1,1,0},{1,0,1}};
        int[][] samples3 = {{1,1,1},{1,1,1},{1,1,0}};
        int[][] samples = {{1,1,1},{1,1,0},{1,0,1}};
        int num = largestArea(samples);
        System.out.println(num);
    }
    
    public static int largestArea(int[][] samples){
        int res = 0;
        int[][] arr = new int[samples.length][samples[0].length];
        for(int i = 0; i < samples.length; i++){
            for(int j = 0; j < samples[0].length; j++){
                arr[i][j] = samples[i][j];
                if(i > 0 && j > 0 && samples[i][j] == 1){
                    arr[i][j] = Math.min(arr[i-1][j], arr[i][j-1]);
                    arr[i][j] = Math.min(arr[i][j], arr[i-1][j-1]);
                    arr[i][j]++;
                }
                res = Math.max(res, arr[i][j]);
            }
        }
        return res;
    }
    
//     public static boolean decide(int[][] samples, int r, int c, int num){
//         int total = 0;
//         if(!(r-num>=0 && r+num<samples.length && c-num>=0 && c+num<samples[0].length))return false;
//         while()
//         if(!(r-num>=0 && r-num<samples.length && c>=0 && c<samples[0].length) && samples[r-num][c] == 1)total++;
//         if(!(r+num>=0 && r+num<samples.length && c>=0 && c<samples[0].length) && samples[r+num][c] == 1)total++;
//         if(!(r>=0 && r<samples.length && c-num>=0 && c-num<samples[0].length) && samples[r][c-num] == 1)total++;
//         if(!(r>=0 && r<samples.length && c+num>=0 && c+num<samples[0].length) && samples[r-num][c+num] == 1)total++;
//         if(total == 4)return true;
//         else return false;
//     }
    
//     public static void dfs(int[][] samples, int r, int c){
//         if(!(r>=0 && r<samples.length && c>=0 && c<samples[0].length))return;
//         if(samples[r][c] == 0){
//             return;
//         }
//         samples[r][c] = 0;
//         dfs(samples, r+1, c);
//         dfs(samples, r-1, c);
//         dfs(samples, r, c+1);
//         dfs(samples, r, c-1);
//     }
}
