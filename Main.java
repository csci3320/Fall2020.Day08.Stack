public class Main{
    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<String>();

        stack.push("Basketball");
        System.out.println(stack.size());
        stack.push("Football");
        System.out.println(stack.pop());

    }
}
