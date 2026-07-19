import java.util.HashMap;
import java.util.Stack;

class smallestSubsequence {
    public String smallestSubsequence(String s) {
        HashMap<Character, Integer> lastSeen = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastSeen.put(s.charAt(i), i);
        }

        Stack<Character> stack = new Stack<>();
        boolean[] inStack = new boolean[26]; 

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (inStack[c - 'a']) {
                continue;
            }

            while (!stack.isEmpty() && stack.peek() > c && lastSeen.get(stack.peek()) > i) {
                char removed = stack.pop();
                inStack[removed - 'a'] = false;
            }

            stack.push(c);
            inStack[c - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}
