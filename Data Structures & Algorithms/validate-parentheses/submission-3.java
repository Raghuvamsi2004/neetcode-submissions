class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            switch (ch){
                case ']':
                    if(!stack.isEmpty() && stack.peek()=='['){
                        stack.pop();
                    }
                    else{
                        stack.push(ch);
                    }
                    break;
                case ')':
                    if(!stack.isEmpty() && stack.peek()=='('){
                        stack.pop();
                    }
                    else{
                        stack.push(ch);
                    }
                    break;
                case '}':
                    if(!stack.isEmpty() && stack.peek()=='{'){
                        stack.pop();
                    }
                    else{
                        stack.push(ch);
                    }
                    break;
                default:
                    stack.push(ch);
                
            }
        }
        return stack.isEmpty();
    }
}
