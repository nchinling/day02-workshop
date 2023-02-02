package cards;
import java.util.Random; 

public class Cards {
    
    //members
    private String[] suit = new String[] {"Spades","Diamond","Hearts","Clubs"};
    private String[] number = new String[] {"2","3","4","5","6","7","8","9","10","J","Q","K","A*"};

    //constructor
    public Cards(){}


    //getters/setters
    public String[] getSuit() {
        return suit;
    }


    public void setSuit(String[] suit) {
        this.suit = suit;
    }


    public String[] getNumber() {
        return number;
    }


    public void setNumber(String[] number) {
        this.number = number;
    }



    public void shufflecard(){
        Random rand = new Random();
        int i = rand.nextInt(13);
        this.number[i] = number[i]; 
        // System.out.printf("The number is %s\n", number[i]);

        int j = rand.nextInt(4);
        this.suit[j] = suit[j];
        // System.out.printf("The suit is %s\n", suit[j]);
        System.out.printf("The card is %s%s\n", number[i],suit[j]);



        

    }
}