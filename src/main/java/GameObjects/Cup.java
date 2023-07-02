package GameObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cup {

    Dice[] dices = new Dice[5];
    int[] results = {1, 1, 1, 1, 1};



    public int[] rollDices(int[] indices) {

        for (int index : indices) {
            results[index] = dices[index].roll();
        }

        return results;
    }
}
