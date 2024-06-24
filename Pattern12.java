import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {   
                System.out.print(ch);
                 ch++;
            }
            System.out.println(" ");
        }
    }
}