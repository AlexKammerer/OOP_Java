package OOP_Java;

public class Cat extends Creature {
    private String type = "Кот";
    private int distance;
    private int height;

    private boolean moving;

    public Cat(int distance, int height) {

        this.distance = distance;
        this.height = height;
        this.moving = true;
    }

    public String run(int dist) {
        if (dist <= distance) {
            return (type + " успешно пробежал");
        } else {
            moving = false;
            return (type + " не пробежал");
        }
    }

    public String jump(int hgt) {
        if (hgt <= height) {
            return (type + " успешно перепрыгнул");
        } else {
            moving = false;
            return (type + " не перепрыгнул");
        }
    }

    public boolean isMoving() {
        return moving;
    }
}
