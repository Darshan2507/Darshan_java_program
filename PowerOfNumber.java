import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        int n, p, i, result = 1;
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter a power : ");
        p = sc.nextInt();
        for (i = 1; i <= p; i++) {
            result = n * result;
        }
        System.out.println("power is " + result);

    }

}
