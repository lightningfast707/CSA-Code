package CSA.FRQ;

/* 
import java.util.List;
public class MixingWords 
{
    public static String scrambleWord(String word)
    {
        String newString = "";
        if (word.length() == 1)
        {
            return word;
        }
        for (int i = 0; i < word.length(); i = i+2)
        {
            if (word.charAt(i) == 'A')
            {   
                if(word.substring(i,i+2) != "A")
                {
                    newString += word.charAt(i+1) + "A";
                }
            }
            else
            {
                newString+=word.charAt(i);
            }
        }
        return newString;
    }

    public static void scrambleOrRemove(List<String> wordList)
    {
        for (int i = wordList.size()-1; i >= 0; i--)
        {
            String s = scrambleWord(wordList.get(i));
            if(s.equals(wordList.get(i)))
            {
                wordList.remove(i);
            }
            wordList.set(i,s);
        }
    }
    public static void main(String [] args)
    {
        System.out.println(scrambleWord("TAN"));
        System.out.println(scrambleWord("ABRACADABRA"));
        System.out.println(scrambleWord(("WHOA")));
        //System.out.println(scrambleWord("AARDVARK"));
        //System.out.println(scrambleWord("A"));
        //System.out.println(scrambleWord(""));
    }
    
}
*/
