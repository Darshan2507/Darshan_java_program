import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch);
                ch++;
            }
            ch = 'A';
            System.out.println(" ");
        }
    }
}