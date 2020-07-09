public class Pokemon {

    public String type;
    public double health;
    public double attack;

    public Pokemon(String x, double y, double z){
        type = x;
        health = y;
        attack = z;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}