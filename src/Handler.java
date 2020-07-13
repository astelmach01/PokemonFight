import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Handler extends JFrame {

    static ArrayList<String> pokemon = new ArrayList<>();

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome to the arena!\nPlease select your starter pokemon:" +
                "\n1) Piplup\n2) Chimchar\n3) Turtwig");
        int choice = scan();
       pokemon.add(chooseStarter(choice));

        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        Trainer trainer = new Trainer(pokemon, name);
        System.out.println("Hello " + name + "! You chose: " + pokemon.get(0) +" \nPress 1 " +
                "to enter the arena!");
        int enter = scan.nextInt();
        if(enter == 1){
            enterArena();
        }
       Bot botOne = new Bot(1);


    }

    private static String chooseStarter(int x){
        switch (x){
            case 1:
                return "Piplup";
            case 2:
                return "Chimchar";
            case 3:
                return "Turtwig";
            default:

        }
        return "";
    }

    private static int scan(){
        String thing;
        int result;
        try {
            thing = scan.nextLine();
            result = Integer.parseInt(thing);

            if(result < 1 || result > 3){
                System.out.println("Number is not 1, 2, or 3. Please enter number again:");
                result = scan();
            }

        } catch (Exception e) {
            System.out.println("Please enter a number:");
            result = scan();
        }
        return result;
    }

    private static void enterArena(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.width/1.5;
        double height = screenSize.height/1.5;

        JFrame frame = new JFrame("Arena");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize((int)width, (int) height);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
