package OOP_Java;

public class Start {

    public static void main(String[] args) {
        Obstacle t = new Tread(1000);
        Obstacle w = new Wall(15);

        Human h = new Human(1500, 8);
        Robot r = new Robot(2000, 15);
        Cat c = new Cat(1000, 10);

        Obstacle[] obstacles = {t, w};
        Creature[] creatures = {h, r, c};

        for (Obstacle obstacle : obstacles) {
            if (obstacle.getType().equals("Tread")) {
                Tread tread = (Tread) obstacle;
                int dist = tread.getDist();
                for (Creature creature : creatures) {
                    if (creature.isMoving()) {
                        System.out.println(creature.run(dist));
                    }
                }
            } else if (obstacle.getType().equals("Wall")) {
                Wall wall = (Wall) obstacle;
                int hgt = wall.getHgt();
                for (Creature creature : creatures) {
                    if (creature.isMoving()) {
                        System.out.println(creature.jump(hgt));
                    }
                }
            }
        }
    }
}
