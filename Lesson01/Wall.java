package OOP_Java;

public class Wall extends Obstacle {
    private int hgt;

    public Wall (int hgt) {
        super("Wall");
        this.hgt = hgt;
    }

    public int getHgt() {
        return hgt;
    }
}
