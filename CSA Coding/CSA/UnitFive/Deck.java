package CSA.UnitFive;

public class Deck 
{
    int currentcard;
    //new array of 52 cards
    Card cards[] = new Card[52];

    public Deck ()
    {
        for(int i=0;i<13;i++){
            for(int j=0;j<4;j++){
                this.cards[i*4+j] = new Card(i+1);
            }
        }
        currentcard = 0;
    }
    //draw card out of deck
    public Card draw()
    {
        if (currentcard < 52){
            Card c = cards[currentcard];
            currentcard++;
            return c;
        }
        return null;
    }
    public void shuffle()
    {
        //shuffle cards
        for (int i = 0; i < cards.length; i++)
        {
            //choose random int between 0 and 52
            int random = (int) (Math.random()*52);
            //swapping index of cards[i] with cards[random]
            Card card = cards[i];
            cards[i] = cards[random];
            cards[random] = card;
        }
    }
    //testing methods
    public String toString() {
        String ret = "Current card index: "+currentcard;
        for(int i=0;i<cards.length;i++){
            ret += "\n"+i+": "+cards[i];
        }
        return ret;
    }
    //testing methods
    public static void main (String [] args)
    {
        Deck d1 = new Deck();
        System.out.println(d1);
        d1.shuffle();
        System.out.println(d1);
        Card card = d1.draw();
        System.out.println(card);
    }
}
