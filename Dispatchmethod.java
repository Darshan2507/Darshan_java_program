import java.util.*;
class Game{
    public void type(){
        System.out.println("indoor & outdoor");
    }
}
class Cricket extends Game{
    public void type(){
        System.out.println("outdoor game");
    }
}
class Badminton extends Game{
    public void type(){
        System.out.println("indoor game");
    }
}
class Tennis extends Game{
    public void type(){
        System.out.println("mix game");
    }
}
public class Dispatchmethod {
    public static void main(String[] args) {
        Game g = new Game();
        Cricket c = new Cricket();
        Badminton b = new Badminton();
        Tennis t = new Tennis();
        Scanner s = new Scanner(System.in);
        System.out.println("please enter name \n of the game");
        String op = s.nextLine();
        if (op.equals("cricket")) {
            g = c;
        }
        else if(op.equals("badminton")){
            g = b;
        }
        else if (op.equals("tennis")){
            g = t;
        }
        g.type();
    }
}
