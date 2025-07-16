import java.util.Scanner;

class Stack {
    int top;
    int size;
    int[] sArray;

    public Stack(int size) {
        this.size = size;
        sArray = new int[size]; // array creation
        top = -1; // initialization of top.
    }

    // push operation.
    public void insert(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            sArray[++top] = value; // increment top first, then insert
            System.out.println(value + " is pushed..");
        }
    }

    // pop operation
    public void pop() {
        if (top == -1) {
            System.out.println("Cannot remove, stack is empty...");
        } else {
            System.out.println(sArray[top--] + " is popped..");
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + sArray[top]);
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements from top to bottom:");
            for (int i = top; i >= 0; i--) {
                System.out.println(sArray[i]);
            }
        }
    }
}

public class StackArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of stack:");
        int capacity = sc.nextInt();

        Stack s = new Stack(capacity);

        s.insert(1);
        s.insert(2);
        s.insert(3);
        s.insert(4);

        System.out.println("After insertion:");
        s.display();

        s.pop();

        System.out.println("-----After pop-----");
        s.display();

        s.peek();
    }
}