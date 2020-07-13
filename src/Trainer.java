import java.util.ArrayList;

public class Trainer {
    ArrayList pokemon;
    private String name;

    public Trainer(){

    }
    public Trainer(ArrayList pokemon, String name){
        this.pokemon = pokemon;
        this.name = name;
    }

    public ArrayList getPokemon() {
        return pokemon;
    }

    public void add(String x) {
        pokemon.add(x);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
