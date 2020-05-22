package OOP_Java;

public abstract class Obstacle {
    private String type;

    public Obstacle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
