package HomeWork01;

public class Cat implements Runnable, Jumpble {

    public String getType() {
        return "Cat";
    }
    public void jump() {
        System.out.println(getType() + " jump");
    }

    public void run() {
        System.out.println(getType()   + " run" );
    }
}
