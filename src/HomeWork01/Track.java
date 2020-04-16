package HomeWork01;

public class Track {
    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    void run(Runnable runnable) {
        runnable.run();
    }
}

