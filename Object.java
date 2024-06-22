class Mahesh{
    int x = 5;
    int y = 3;
     static void fun1(){
        System.out.println("Hello");
    }
    void fun2(){
        System.out.println("Hi");
    }
}
public class Object {
    public static void main(String[] args) {
        Mahesh m1 = new Mahesh();       
        Mahesh m2 = new Mahesh();
        

        System.out.println(m1.x);
        System.out.println(m2.y);
        Mahesh.fun1();
    }
}
