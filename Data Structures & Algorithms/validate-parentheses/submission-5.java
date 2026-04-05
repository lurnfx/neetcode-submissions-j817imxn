class Solution {
    public boolean isValid(String s) {
       //create stack to maintain the order and return the top value 
   
   if(s.length()==1){return false;}
        Stack<Character> stack = new Stack<>();
        //charatater array to add into stack
        for(char c : s.toCharArray()){
         // all first open brackets so we can check other as per order into stack [ ([{}])  ]
         if(c == '(' || c == '{' || c == '['){
            stack.push(c);  //push every open bracket
         }else{
            //eadge case if stack is empty 
            if(stack.isEmpty()) return false;
            //pop the top char 
             char top = stack.pop(); 
             //this case check for the closed bracket 
            if(c == ')' && top!='('  
            || c == '}' && top!='{' 
            || c == ']' && top!='[') {return false;}
            
         }

        }
      return stack.isEmpty();

    }
}
