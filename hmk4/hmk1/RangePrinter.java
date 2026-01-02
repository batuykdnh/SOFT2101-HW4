import java.util.Scanner;

public class RangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        
        int start = Math.min(n1, n2);
        int end = Math.max(n1, n2);

        // Prints numbers strictly between inputs
        for (int i = start + 1; i < end; i++) {
if (i % 2 != 0) {
    System.out.print(i + " ");
}
        }
    }
}