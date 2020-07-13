import java.util.ArrayList;

public class Bot extends Trainer{

    public Bot(int x){
        switch (x){
            case 1:
                create(1);
                break;
            case 2:
                create(2);
                break;
            case 3:
                create(3);
                break;
        }
    }

    private static ArrayList easy(){
        ArrayList<String> thing = new ArrayList<>();
        thing.add("Chimchar");
        thing.add("Mankey");
        thing.add("Bonsley");
        return thing;
    }

    private ArrayList medium() {
        ArrayList<String> thing = new ArrayList<>();
        thing.add("Bronzong");
        thing.add("Gabite");
        thing.add("Lucario");
        thing.add("Weabile");
        thing.add("Magnezone");
        return thing;
    }
    private ArrayList hard() {
        ArrayList<String> thing = new ArrayList<>();
        thing.add("Magmortar");
        thing.add("Glaceon");
        thing.add("Regigas");
        thing.add("Rampardos");
        thing.add("Empoleon");
        thing.add("Torterra");
        return thing;
    }

    private Trainer create(int i) {

        switch (i){
            case 1:
                return new Trainer(easy(), "EasyBot");

            case 2:
                return new Trainer(medium(), "MediumBot");

            case 3:
                return new Trainer(hard(), "HardBot");

            default:
                return new Trainer();
        }

    }



}
