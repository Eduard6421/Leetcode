
import java.util.HashMap;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Eduard
 */
public class Solution20 {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); ++i) {

            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if(stack.empty()){
                    return false;
                }
                if ((s.charAt(i) == ')' && stack.peek() != '(')
                    || (s.charAt(i) == ']' && stack.peek() != '[')
                    || (s.charAt(i) == '}' && stack.peek() != '{')) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.size()== 0) {
            return true;
        }

        return false;
    }
}
