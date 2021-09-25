/**
* For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
**/
class Solution {
    // public int minAddToMakeValid(String s) {
    //     int res = 0;
    //     int bal = 0;
    //     for(int i = 0; i < s.length(); i++){
    //         if(s.charAt(i) == '('){
    //             bal += 1;
    //         }else if(s.charAt(i) == ')'){
    //             bal -= 1;
    //         }
    //         if(bal == -1){
    //             res++;
    //             bal++;
    //         }
    //     }
    //     return res+bal;
    // }
    
     public int minAddToMakeValid(String s) {
         Stack<Character> stack = new Stack<>();
         int res = 0;
         for(int i = 0; i < s.length(); i++){
             if(s.charAt(i) == '('){
                 stack.push('(');
             }else if(s.charAt(i) == ')' && stack.isEmpty()){
                 res++;
             }else{
                 stack.pop();
             }
         }
         return res+stack.size();
    }
}
