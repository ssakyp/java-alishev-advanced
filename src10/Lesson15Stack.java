import java.util.Stack;

public class Lesson15Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();   //last in first out
        // 5 <- 3 <- 1
        stack.push(5);
        stack.push(2);
        stack.push(1);
//        System.out.println(stack.peek());   // leaves the value
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        while (!stack.empty()){
            System.out.println(stack.pop());
        }

    }
}
