//Example:
// n = 6, command = ['000', '1110', '01', '001', '110', '11']
// 1. '000' - 0 (No command has previously been entered)
// 2. '1110' -1 (There is no previous command that shares a common prefix, so the last command is shown)
// 3. '01' -1 ('000' shares the prefix '0' with the first command)
// 4. '001' -1 ('000' shares the prefix '00' with the first command)
// 5. '110' -2 ('110' shares the prefix '11' with the second command)
// 6. '11' -5 ('11' shares the prefix '11' with the fifth command most recently)

public class Main {
    public static void main(String[] args) {
        //String[] command = {"000", "1110", "01", "001", "110", "11"};
        //String[] command = {"100110", "1001", "1001111"};
        int[] result = autocomplete(command);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
    
    public static int[] autocomplete(String[] command){
        int[] arr = new int[command.length];
        arr[0] = 0;
        int index = 1;
        for(int i = 1; i < command.length; i++){
            int currSize = command[i].length();
            int maxPrefix = 0;
            int prefixNum = 0;
            for(int j = i-1; j >= 0; j--){
                int preSize = command[j].length();
                int min = Math.min(currSize, preSize);
                int prefix = 0;
                for(int m = 0; m < min; m++){
                    if(command[i].charAt(m) == command[j].charAt(m)){
                        prefix++;
                    }else break;
                }
                if(prefix > maxPrefix){
                    maxPrefix = prefix;
                    prefixNum = j+1;
                }
                if(prefix == command[i].length())break;
            }
            if(maxPrefix == 0){
                arr[index] = i;
                index++;
            }else{
                arr[index] = prefixNum;
                index++;
            }
        }
        return arr;
    }
}
