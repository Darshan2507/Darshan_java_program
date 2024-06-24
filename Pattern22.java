import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
