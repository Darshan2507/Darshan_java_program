import java.util.*;
public class Stringscompare {
    public static void main(String[] args) {
        String name1 = "tony";
        String name2 = "tony";
        // s1 > s2 : +ve value
        // s1 == s2 : 0
        // s1 < s2 : -ve value

        if(name1.compareTo(name2) == 0){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("string are not equal");
        }

        // nichenu kyarek j chale -->

        // if(name1 == name2){
        //     System.out.println("strings are equal");
        // }
        // else{
        //     System.out.println("strings are not equal");
        // }

        //  imp note : strings are immutable

    }
}
