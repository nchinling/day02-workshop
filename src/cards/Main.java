package cards;
import java.io.Console;
import java.util.Random; 

public class Main{
    public static void main(String[] args){

        Cards cards = new Cards();

        Console cons = System.console();
        String numberOfCards = cons.readLine("Enter the number of cards to draw: ");
        int intNumberOfCards = Integer.parseInt(numberOfCards);
        for (int i=0; i<intNumberOfCards; i++){
        cards.shufflecard();
        }




    }

}