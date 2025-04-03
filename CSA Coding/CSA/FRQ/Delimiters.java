package CSA.FRQ;

import java.util.ArrayList;

//import java.util.Arrays;

public class Delimiters 
{
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimiters(String [] tokens)
    {
        ArrayList<String> del = new ArrayList<String>();
        for (String t : tokens)
        {
            if (t.equals(openDel) || t.equals(closeDel))
            {
                del.add(t);
            }
        }
        return del;

    }

    public boolean isBalanced(ArrayList<String> delimiters)
    {
        int countopen = 0;
        int countclose = 0;

        for (int i = 0; i < delimiters.size(); i++)
        {
            if (delimiters.get(i).equals(openDel))
            {
                countopen++;
            }
            else
            {
                countclose++;
            }

            if (countclose > countopen)
            {
                return false;
            }

        }
        if (countopen == countclose)
        {
            return true;
        }
        return false;
    }

    public static void main(String [] args)
    {
        Delimiters d1 = new Delimiters("<sup>","</sup>");
        //String [] t1 = {"(","x + y",")","* 5"};
        //System.out.println(d1.getDelimiters(t1));
        //String [] t2 = {"<q>","yy","</q>","zz","</q>"};
        //System.out.println(d1.getDelimiters(t2));
        ArrayList<String> t3= new ArrayList<String>();
        t3.add("<sup>");
        t3.add("<sup>");
        t3.add("</sup>");
        //t3.add("<sup>");
        //t3.add("</sup>");
        //t3.add("/sup");
        System.out.println(d1.isBalanced(t3));
    }
    
}
