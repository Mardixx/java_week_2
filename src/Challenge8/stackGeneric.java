package Challenge8;

import java.util.Stack;

public class stackGeneric<T>
{

    Stack<T> stack;

    T pushed;
    T pushed2;

    stackGeneric(T pushed, T pushed2)
    {
        this.pushed = pushed;
        this.pushed2 = pushed2;

        this.stack = new Stack<T>();
    }
    void stacking()
    {
        if(stack.empty()) {
            System.out.println("Empty stack: " + stack.size());
            System.out.println("Hey, no String? Here you go!");
            stack.push(pushed);
            stack.push(pushed2);
        } else {
            System.out.println("That's for you: " + stack);
            System.out.println("Here the top of the stack: " + stack.peek());
            System.out.println("Original size of stack: " + stack.size());
            System.out.println("The stack is empty: " + stack.empty());
        }
    }
    void popping()
    {
        if(stack.empty()) {
            System.out.println("Nope");
            System.out.println("Empty stack: " + stack.size());
        } else {
            stack.pop();
            System.out.println(stack);
            System.out.println("New size of stack after popping element at top of it: " + stack.size());
        }
    }

}
