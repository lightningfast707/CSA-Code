package CSA.FRQ;

import java.util.Arrays;

public class WordScrambler 
{
    private String [] scrambledWords;

    
    public WordScrambler(String [] wordArr)
    {
        scrambledWords = mixedWords(wordArr);
    }
    

    private String recombine(String word1, String word2)
    {
        return word1.substring(0, word1.length()/2) + 
        word2.substring(word2.length()/2, word2.length());
    }
    
    private String [] mixedWords(String [] words)
    {
        String [] newWords = new String[words.length];
        for (int i = 0; i < words.length; i = i+2)
        {
            newWords[i] = recombine(words[i], words[i+1]);
            newWords[i+1] = recombine(words[i+1], words[i]);
        }
        return newWords;
    }
    public static void main(String [] args)
    {
        String [] w = {"apple","pear","this", "cat"};
        WordScrambler w1 = new WordScrambler(w);
        System.out.println(w1.recombine("apple", "pear"));
        System.out.println(w1.recombine("pear", "apple"));
        System.out.println(w1.recombine("this", "cat"));
        System.out.println(w1.recombine("cat", "this"));
        System.out.println(Arrays.toString(w1.mixedWords(w)));
    }
     
}
