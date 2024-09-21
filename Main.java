import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        // Push elements to the stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);

        // Pop an element from the stack
        animals.pop();
        System.out.println("Stack after pop: " + animals);
    }
}
