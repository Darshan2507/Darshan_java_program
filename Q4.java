import java.util.Scanner;
public class Q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,flag=0;;
        n=sc.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("entered no is not prime:");
        }
        else{
            System.out.println("prime");
        }
    }
}