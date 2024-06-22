import java.util.Scanner;

public class Ywd {
    public static void main(String[] args) {
        int year, week, day;
        System.out.println("Enter a day : ");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        year = day / 365;
        day = day % 365;
        week = day / 7;
        day = day % 7;
        System.out.println("year : " + year);
        System.out.println("week : " + week);
        System.out.println("day : " + day);
    }

}
