public class Main {
    public static void main(String[] args) {
        //int[] magic = {2, 4, 5, 2};
        //int[] dist = {4, 3, 1, 3};
        int[] magic = {8, 4, 1, 9};
        int[] dist = {10, 9, 3, 5};
        int res = optimalPoint(magic, dist);
        System.out.println(res);
    }
    
    private static int optimalPoint(int[] magic, int[] dist) {
        int startIndex = 0;
        int remainingMagic = 0;
        int usedMagic = 0;
        int length = magic.length;
        
        for (int i = 0; i < length; i++) {
            remainingMagic += magic[i] - dist[i];
            if (remainingMagic < 0) {
                startIndex = i + 1;
                usedMagic += remainingMagic;
                remainingMagic = 0;
            }
        }
        return usedMagic + remainingMagic >= 0 ? startIndex : -1;
    }
}
