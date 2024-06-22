import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * (i + 1)) / 2;  
        }
        System.out.println(sum);
    }

}
