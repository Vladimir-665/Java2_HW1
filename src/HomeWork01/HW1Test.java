package HomeWork01;

public class HW1Test {
    public static void main(String[] args) {
        Track track = new Track(100);
        track.run(new Cat());
        track.run(new Human());
        track.run(new Robot());
        Barrier barrier = new Barrier(10);
        barrier.jump(new Cat());
        barrier.jump(new Human());
        barrier.jump(new Robot());
    }
}

