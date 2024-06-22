import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        int n, i, count = 0;
        System.out.println("Enter a number :");
        Scanner a = new Scanner(System.in);
        n = a.nextInt();
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(count + " is prime");
        } else {
            System.out.println("not prime");
        }

    }

}
