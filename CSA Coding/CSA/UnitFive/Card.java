package CSA.UnitFive;

public class Card 
{
    /* numerical representation of a card 
    1 = Ace
    2 - 10 = actual cards
    11 = Jack
    12 = Queen
    13 = King
    */
    int card;
    //card constructor
    public Card(int c)
    {
        card = c;
    }
    public int getValue()
    {
        //value  of cards > 10
        if (card > 10)
        {
            return 10;
        } 
        //value of Ace
        else if (card == 1)
        {
            return 11;
        }
        //other cards
        else
        {
            return card;
        }
    }
    /*String representation of the card based on numerical values listed in
      the first comment
    */
    
    public String toString()
    {
        if (card == 1)
        {
            return "Ace";
        }
        else if (card >= 2 && card <=10)
        {
            return "" + card;
        }
        else
        {
            if (card == 11)
            {
                return "Jack";
            }
            else if (card == 12)
            {
                return "Queen";
            }
            else
            {
                return "King";
            }
        }
    }
}
