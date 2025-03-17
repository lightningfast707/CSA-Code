package CSA.UnitSeven;
import java.util.ArrayList;

public class Word 
{
    private String word;
    private ArrayList<Character> chars = new ArrayList<Character>();

    public Word (String w)
    {
        this.word = w;
        for (int i = 0; i < word.length(); i++)
        {
            chars.add(word.charAt(i));
        }
    }
    public void setWord(String newWord)
    {
        this.word = newWord;
    }
    public int getNumVowels()
    {
        int count = 0;
        for (int i = 0; i < chars.size(); i ++)
        {
            if (chars.get(i) == 'a' || chars.get(i) == 'e'
            || chars.get(i) == 'i' || chars.get(i) == 'o' 
            || chars.get(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
    public int getLength()
    {
        return chars.size();
    }
    public String toString()
    {
        return this.word;
    }
    public static void main(String [] args)
    {
        

        Word one = new Word("chicken");
        System.out.println(one.toString());
        System.out.println("num vowels == " + one.getNumVowels());
        System.out.println("num chars == " + one.getLength());

        one.setWord("alligator");
        System.out.println("\n\n"+one.toString());
        System.out.println("num vowels == " + one.getNumVowels());
        System.out.println("num chars == " + one.getLength());

        one.setWord("elephant");
        System.out.println("\n\n"+one.toString());
        System.out.println("num vowels == " + one.getNumVowels());
        System.out.println("num chars == " + one.getLength());

        
    }
}
