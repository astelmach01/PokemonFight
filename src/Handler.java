import java.util.*;

public class Handler {


    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the arena!\nPlease select your starter pokemon:" +
                "\n1) Piplup\n2) Chimchar\n3) Turtwig");
        int choice = scan();
        String starter = chooseStarter(choice);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        Trainer trainer = new Trainer(starter, name);

    }
    private static int scan(){
        int result = 0;
        try {
            result = scan.nextInt();
            if(result < 1 || result > 3){
                System.out.println("Number is not 1, 2, or 3. Please enter number again:");
                result = scan();
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Invalid entry! Enter number again:");
            result = scan();
        }
        return result;
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
    private static double attack(double x, double y){
        return x - y;
    }
}
