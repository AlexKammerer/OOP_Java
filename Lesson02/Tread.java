package OOP_Java;

public class Tread extends Obstacle {
    private int dist;

    public Tread (int dist) {
        super("Tread");
        this.dist = dist;
    }

    public int getDist() {
        return dist;
    }
}
