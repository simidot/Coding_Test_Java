import java.util.*;

public class Solution {
    public Stack solution(int []arr) {
        //int[] answer = {};
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<arr.length; i++) {
            if (!stack.empty() && stack.peek()==arr[i]) {
                stack.pop();
            }
            stack.push(arr[i]);
        }

        return stack;
    }
}