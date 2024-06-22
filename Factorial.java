import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i, f = 1, n;
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("Factorial is " + f);

    }

}
