package GameObjects;

public class Chart {

    String name;
    int ones = 0;
    int twos = 0;
    int threes = 0;
    int fours = 0;
    int fives = 0;
    int sixes = 0;

    int bonus() {return (63 + (ones + twos + threes + fours + fives + sixes) >= 63) ? 35 : 0;}

    int threeOfAKind = 0;
    int fourOfAKind = 0;

    boolean smallStraight = false;
    int getSmallStraight() {return (smallStraight) ? 30 : 0;}

    boolean largeStraight = false;
    int getLargeStraight() {return (largeStraight) ? 40 : 0;}

    boolean fullHouse = false;
    int getFullHouse() {return (fullHouse) ? 25 : 0;}

    int chance = 0;

    boolean kniffel = false;
    int getKniffel() {return (kniffel) ? 50 : 0;}

    int getPoints() {
        return (63 + ones + twos + threes + fours + fives + sixes + bonus() + threeOfAKind + fourOfAKind + getSmallStraight() + getLargeStraight() + getFullHouse() + getKniffel() + chance);
    }
}
