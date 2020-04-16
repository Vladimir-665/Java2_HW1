package HomeWork01;

public class Human implements Runnable, Jumpble {
    private int maxDistance;
    private int maxHeight;

    public String getType() {
        return "Human";
    }
    public void jump() {
        System.out.println(getType() + " jump");
    }
    public void run() {
        System.out.println(getType() + " run");
    }
}
