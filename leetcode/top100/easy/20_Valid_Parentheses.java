class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1) return false;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            switch(s.charAt(i)){
                case ')':
                    if(stack.size() == 0 || stack.pop() != '(')
                        return false;
                    break;
                case ']':
                    if(stack.size() == 0 || stack.pop() != '[')
                        return false;
                    break;
                case '}':
                    if(stack.size() == 0 || stack.pop() != '{')
                        return false;
                    break;
                default:
                    stack.push(s.charAt(i));
                    break;
            }
        }
        
        return stack.isEmpty();
    }
}
