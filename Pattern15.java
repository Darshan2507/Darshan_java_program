import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                
                System.out.print(ch);
                ch++;
            }
            
            System.out.println(" ");
        }
    }
}