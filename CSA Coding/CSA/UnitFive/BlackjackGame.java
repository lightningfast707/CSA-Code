package CSA.UnitFive;
//import scanner class
import java.util.Scanner;

public class BlackjackGame 
{
    //method to play one game
    public static void play()
    {
        //import a new scanner class
        Scanner keyboard = new Scanner(System.in);
        //sets conditions for whether player and dealer are busted; intially set to false
        boolean playerDone = false;
        boolean playerBusted = false;
        //create new Deck
        Deck deck = new Deck();
        Card c1;
        //shuffle deck
        deck.shuffle();
        //create new hand
        Hand playerhand = new Hand();
        //while loop to indicate the player turn 
        while (!playerDone)
        {
            //ask for the action of the player
            System.out.print("What is your action (stand or hit)?" + " ");
            String action = keyboard.next();
            //if action is hit do this
            if(action.toLowerCase().equals("hit"))
            {
                //draw from the deck
                c1 = deck.draw();
                //add card to hand
                playerhand.addCard(c1);
                //show the cards in the hand
                playerhand.showCards();
                //create variable called total and get the value of the hand of the player
                int total = playerhand.getValue();   
                //if total > than 21 (checking value)
                if (total > 21)
                {   
                    //player loses
                    playerBusted = true;
                    playerDone = true;
                    System.out.println("Dealer wins!");
                }
                else
                {
                    //continue loop if hand not > than 21
                    continue;
                }
            }
            else
            {
                //don't do anything to deck
                //move to done state --> value of the hand is current; either 21 or over
                playerDone = true;
            }

        }
        //dealer turn; create variables to indicate dealerDone and busted
        boolean dealerDone = false;
        boolean dealerBusted = false;
        Card c2;
        //create new hand
        Hand dealerhand = new Hand();
        while (!dealerDone && !playerBusted)
        {
            //draw from deck
            c2 = deck.draw();
            //add card to dealer "hand"
            dealerhand.addCard(c2);
            //show cards of the dealer
            dealerhand.showCards();
            //spacing for printing dealer cards
            System.out.println("===================");
            //create varaible called total to store the value of getvalue for the dealer hand
            int total = dealerhand.getValue();
            //comparing dealer value 
            if (total < 17)
            {
                //if hand value of dealer <17 then continue loop
                continue;
            }
            else if (total > 21)
            {
                //if hand value > 21 then player wins and dealer is busted
                dealerBusted = true;
                System.out.println("Player wins!");
            }
            else 
            {
                //otherwise end turn of dealer
                dealerDone = true;
            }
        }
        /*checking condition if both dealer and player get through the while loop
         without getting busted; both dealer and player end their turns with hand value
         less than 21
        */
        //store values of player hand and dealer hand in total
        int dealertotal = dealerhand.getValue();
        int playertotal = playerhand.getValue();
        //if playerbusted then do nothing
        if (playerBusted)
        {

        }
        //if dealerbusted then do nothing
        else if(dealerBusted)
        {

        }
        //if dealertotal > playertotal then dealer wins
        else if (dealertotal > playertotal)
        {
            System.out.println("Dealer wins");

        }
        //otherwise player wins
        else
        {
            System.out.println("Player wins");
        }
    }
    //Testing/main game
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean quit = false;
        while (!quit)
        {
            play();
            System.out.print("Do you want to play? Y/N" + " ");
            String play = keyboard.nextLine();
            if (play.toLowerCase().equals("n"))
            {
                quit = true;
            }
        }
    }
    
}
