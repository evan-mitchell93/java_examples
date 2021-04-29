
import java.util.Scanner;
import java.util.Random;

public class RandomChoice {
    public enum Name {
        Evan,
        Matt,
        Brayden
    }
    
    public static Name randomName(){
        int selection = new Random().nextInt(Name.values().length);
        return Name.values()[selection];
    }

    public static void displayName(Name name){
        System.out.println(name);
    }

    public static void main(String[] args){
        System.out.println("Type exit to end");
        System.out.println("Press ENTER to choose a random person");

        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        
        while(!in.equals("exit")){
            Name chosenName = randomName();
            displayName(chosenName);
            in = input.nextLine();
        }

        input.close();
        System.out.println("Closing program");

    }
}
