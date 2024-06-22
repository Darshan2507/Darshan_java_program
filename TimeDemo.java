import java.util.*;
class Greet extends Thread {
    public void run(){
        while(true){
            Date dt = new Date();
            if(dt.getHours() >= 9 && dt.getHours()<=12 ){
                System.out.println("good morning");
            }else if(dt.getHours() >= 12 && dt.getHours()<=18){
                System.out.println("good afternoon");
            }else{
                System.out.println("good night");
            }

            try {
                sleep(1000*60*60);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
class Time extends Thread{
    public void run(){
        while(true){
            Date dt = new Date();
            System.out.println("time : " + dt.getHours() + " : " + dt.getMinutes() + " : " + dt.getSeconds() );
            try {
                sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

public class TimeDemo{
    public static void main(String[] args) {
        Greet g = new Greet();
        Time t = new Time();

        g.start();
        t.start();
    }
}