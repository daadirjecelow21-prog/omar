public class Stack {
    int arr[], top = -1, size;

    Stack(int s) {
        size = s;
        arr = new int[size];
    }

    void push(int val) {
        if (top == size - 1)
            System.out.println("Stack full!");
        else
            arr[++top] = val;
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack empty!");
        else
            System.out.println("Popped: " + arr[top--]);
    }

    void peek() {
        if (top == -1)
            System.out.println("Empty!");
        else
            System.out.println("Top: " + arr[top]);
    }

    void display() {
        if (top == -1)
            System.out.println("Empty!");
        else {
            System.out.print("Stack: ");
            for (int i = top; i >= 0; i--)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    void search(int val) {
        for (int i = 0; i <= top; i++) {
            if (arr[i] == val) {
                System.out.println(val + " found at position " + (i + 1));
                return;
            }
        }
        System.out.println(val + " not found!");
    }

    int size() {
        return top + 1;
    }
}