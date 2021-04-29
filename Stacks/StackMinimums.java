import java.util.*;

public class StackMinimums {
    static int min_push(Stack<Integer> stack1, Stack<Integer> stack2, int value, int minimum){
        if(value <= minimum){
            stack2.push(value);
            minimum = value;
        }
        stack1.push(value);
        return minimum;
    }

    static int min_pop(Stack<Integer> stack1, Stack<Integer> stack2, int currentMinimum){
        if(((Integer)stack1.peek()) == currentMinimum){
            stack2.pop();
            currentMinimum = ((Integer)stack2.peek());
        }
        stack1.pop();
        return currentMinimum;
    }

    public static void main(String[] args){
        Stack<Integer> values = new Stack<Integer>();
        Stack<Integer> minimums = new Stack<Integer>();

        int currentMinimum = 100000;
        currentMinimum = min_push(values, minimums, 12, currentMinimum);
        currentMinimum = min_push(values, minimums, 5, currentMinimum);
        currentMinimum = min_push(values, minimums, 7, currentMinimum);

        System.out.println(currentMinimum + " " + values);
        currentMinimum = min_pop(values, minimums, currentMinimum);

        currentMinimum= min_push(values, minimums, 2, currentMinimum);
        currentMinimum = min_push(values, minimums,8, currentMinimum);

        System.out.println(currentMinimum + " "  + values);
        currentMinimum = min_pop(values, minimums, currentMinimum);
        currentMinimum = min_pop(values, minimums, currentMinimum);
        System.out.println(currentMinimum + " " + values);
    }
}
