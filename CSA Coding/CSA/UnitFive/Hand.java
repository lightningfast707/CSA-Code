package CSA.UnitFive;

public class Hand 
{
    Card cards[];
    int maxCardIndex;
    public Hand()
    {
        cards = new Card[52];
        maxCardIndex = 0;
    }
    public void addCard(Card c)
    {
        //add cards to hand
        cards[maxCardIndex] = c;
        maxCardIndex++;
    }
    public void showCards()
    {
        //print out cards in hand
        for (int i = 0; i < maxCardIndex; i++)
        {   
            System.out.println(cards[i]);
        }
    }
    //get value of the hand of dealer/player
    public int getValue()
    {
        //set the total = 0
        int total = 0;
        //set ace_count = 0 because ace can either be 11 or 1 depending
        int ace_count = 0;
        //for every card in the array
        for (int i = 0; i < maxCardIndex; i++)
        {
            //set the card = card at the index
            Card card = cards[i];
            //get the value of that card
            int value = card.getValue();
            //add to total
            total+=value;  
            //compare ace value if == 11 then ace count is incremented
            if (value == 11) {
                ace_count++;
            }
            
        }

       //while total of the hand value > 1 and there is more than 1 ace
        while (total>21 && ace_count>0) {
            //substract 10 to make ace woth 1 
            total-=10;
            //substract ace_count because you do it until total is not > 21
            ace_count--;
        } 
        
        //return the total
        return total;
    }
    //testing methods
    public static void main(String[] args)
    {
        Card c1 = new Card(1);
        Card c2 = new Card(1);
        Card c3 = new Card(1);
        


        Hand hand = new Hand();
        hand.addCard(c1);
        hand.addCard(c2);
        hand.addCard(c3);
        hand.showCards();
        System.out.println(hand.getValue());
    }
}
