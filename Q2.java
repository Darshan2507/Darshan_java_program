import java.util.Scanner;
public class Q2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,t,rem,r=0;
        System.out.println("enter no:");
        n=sc.nextInt();
        t=n;
        while(t>0){
            rem=t%10;
            r=r*10+rem;
            t=t/10;
        }
        System.out.format("Reverse of entered number is = %d\n", r);
		if(n == r) {
			System.out.format("%d is Palindrome.", n);
		}
		else  {
			System.out.format("%d is Not.", n);
		}
	}
}
