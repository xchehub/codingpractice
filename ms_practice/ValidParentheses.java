import java.lang.String;
import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    
    public static boolean isValid(String s) {
        HashMap<Character, Character> mappings;
        mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put(']', '[');
        mappings.put('}', '{');
        
        Stack<Character> stack = new Stack<Character>();
        
        for (int i =0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappings.containsKey(c)) {
                char topElement = stack.empty()? '#': stack.pop();
            
                if (topElement != mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        
        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
        HashMap<Character, Character> symbolMap = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        
        symbolMap.put('(', ')');
        symbolMap.put('{', '}');
        symbolMap.put('[', ']');
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isLetter(c)) {
                if (symbolMap.containsKey(c)) {
                    if (!stack.isEmpty() && symbolMap.get(stack.peek()) != c) {
                        stack.add(c);
                    } else if (stack.isEmpty()){
                        stack.add(c);
                    } else {
                        stack.pop();
                    }
                } else if (c == ')' || c == ']' || c == '}') {
                    if (!stack.isEmpty() && symbolMap.get(stack.peek()) == c ) {
                        stack.pop();
                    } else if (stack.isEmpty()){
                        return false;
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
    }
}
