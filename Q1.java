import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        float a = Sc.nextFloat();
        float b = Sc.nextFloat();
        float c = Sc.nextFloat();
        float d = Sc.nextFloat();
        float e = Sc.nextFloat();
        float p = (a+b+c+d+e)/500*100;
        System.out.println(p);
        if(p>=60){
            System.out.println("first class");
        }
        else if (p>=50 & p<=59){
            System.out.println("second class");
        }
        else if(p>=40 & p<=49){
            System.out.println("third class");
        }
        else if(p<40){
            System.out.println("fail");
        }
    }
}