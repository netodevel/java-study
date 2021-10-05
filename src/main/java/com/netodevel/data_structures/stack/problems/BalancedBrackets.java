package com.netodevel.data_structures.stack.problems;


import com.netodevel.data_structures.stack.Stack;

/**
 * Problem:
 * Input: exp = “[()]{}{[()()]()}”
 * Output: Balanced
 * <p>
 * Input: exp = “[(])”
 * Output: Not Balanced
 */
public class BalancedBrackets {


    public boolean expIsBalanced(String exp) {
        var stack = new Stack<Character>();

        for (int i = 0; i < exp.length(); i++) {
            char current = exp.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
                continue;
            }

            if (stack.size() == 0) {
                return false;
            }

            char check;
            switch (current) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (stack.size() == 0);
    }
}
