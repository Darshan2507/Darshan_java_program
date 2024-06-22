import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                count = count + 1;
                System.out.print(count + " ");
            }
            System.out.println("");
        }

    }

}