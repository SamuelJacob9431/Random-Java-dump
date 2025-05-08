import java.util.Stack;


public class Main{
    public static void main(String[] args) {
        System.out.println("Stack Demonstration");
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack after pushing:" +stack);
        System.out.println("Popped Element:" +stack.pop());
        System.out.println("Peek Element:" +stack.peek());
        System.out.println("Final Stack"+stack);
    }

    @Override
    public String toString() {
        return "Main []";
    }
}