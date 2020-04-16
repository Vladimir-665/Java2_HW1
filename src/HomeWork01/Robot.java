package HomeWork01;

public class Robot implements Runnable, Jumpble {
    private int maxDistance;
    private int maxHeight;

    public String getType() {
        return "Robot";
    }
    public void jump() {
        System.out.println(getType() +" jump");
    }
    public void run() {
        System.out.println(getType() +" run");
    }
}
