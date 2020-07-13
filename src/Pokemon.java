import java.util.HashMap;
import java.util.Map;

public class Pokemon {

    Map<Integer, String> moves = new HashMap<>();
    // use dictionary for moves
    //1, charge
    private String name;
    private double health;
    private double attack;
    private Enum type;

    public Pokemon() {
    }

    public Pokemon(String x, double y, double z, Enum type) {
        name = x;
        health = y;
        attack = z;
        this.type = type;
    }

    public static double attack(double attack, double health) {
        return health - attack;
    }

    public void addMove(int x, String y) {
        moves.put(x, y);
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public String getName() {
        return name;
    }
}
