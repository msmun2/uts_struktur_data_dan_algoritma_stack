import java.util.Stack;

public class CekStack {

    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.push(10);
        stack1.push(20);
        stack1.push(300);

        stack2.push(10);
        stack2.push(20);
        stack2.push(30);

        if(stack1.equals(stack2)) {
            System.out.println("Kedua Stack Sama");
        } else {
            System.out.println("Kedua Stack Tidak Sama");
        }
    }
}