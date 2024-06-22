class Student{
    String name ;
    int age;

    public void studentinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class Demothis{
    public static void main(String[]args){
       Student s1 = new Student();
       s1.name = "darshan";
       s1.age = 18;

       s1.studentinfo();
    } 
}