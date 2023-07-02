package GameObjects;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    public int roll() {
        return ThreadLocalRandom.current().nextInt(7);
    }
}
