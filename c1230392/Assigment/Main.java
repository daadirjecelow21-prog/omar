import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Use default size? (1=Yes, 0=No): ");
        int c = sc.nextInt();

        int cap;
        if (c == 1) {
            cap = 5;
            System.out.println("Default size (5) selected.");
        } else {
            System.out.print("Enter size: ");
            cap = sc.nextInt();
        }

        Stack st = new Stack(cap);

        System.out.print("How many elements to push? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            st.push(sc.nextInt());
        }

        int ch;
        do {
            System.out.println("\n1.Pop  2.Peek  3.Size  4.Display  5.Search  6.Push  7.Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> st.pop();
                case 2 -> st.peek();
                case 3 -> System.out.println("Size: " + st.size());
                case 4 -> st.display();
                case 5 -> {
                    System.out.print("Search value: ");
                    st.search(sc.nextInt());
                }
                case 6 -> {
                    System.out.print("Enter value: ");
                    st.push(sc.nextInt());
                }
                case 7 -> System.out.println("Exit...");
                default -> System.out.println("Invalid!");
            }
        } while (ch != 7);
        sc.close();
    }
}