package HomeWork01;

public class Barrier {
    private int heigth;

    public Barrier(int heigth) {
        this.heigth = heigth;
    }

    void jump(Jumpble jumpble) {
        jumpble.jump();
    }
}
