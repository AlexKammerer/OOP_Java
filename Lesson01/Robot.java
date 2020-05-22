package OOP_Java;

public class Robot extends Creature {
    private String type = "Робот";
    private int distance;
    private int heigth;

    private boolean moving;

    public Robot (int distance, int height) {

        this.distance = distance;
        this.heigth = height;
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
        if (hgt <= heigth) {
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
