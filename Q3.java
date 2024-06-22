import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.print("enter no:");
        a=sc.nextInt();
        System.out.print("enter no:");
        b=sc.nextInt();
        System.out.print("enter no:");
        c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is greatest");
            }
            else{
                System.out.println("c is greatest");
            }
        }
        else{
            if(b>c){
                System.out.println("b is greatest");
            }
            else{
                System.out.println("c is greatest");
            }
        }
    }
}