public class Trainer {
    protected String starter;
    private String name;

    public Trainer(String starter, String name){
        this.starter = starter;
        this.name = name;
    }
    private static double attack(double x, double y){
        return x - y;
    }
}
