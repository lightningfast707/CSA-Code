package CSA.UnitSix.GradeBook;
public class Grade {
    private double value;
    public Grade (double v)
    {
        value = v;
    }
    public double getNumericGrade()
    {
        return value;
    }
    public String getLetterGrade()
    {
        if (value >= 90)
        {
            return "A";
        }
        else if(value >= 80 && value <= 89)
        {
            return "B";
        }
        else if(value >= 70 && value <= 79)
        {
            return "C";
        }
        else if (value >= 60 && value <= 69)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }
    public String toString()
    {
        return value + " " + getLetterGrade();
    }
    public static void main (String [] args)
    {
        Grade g1 = new Grade(75.3);
        Grade g2 = new Grade(33);
        Grade g3 = new Grade(97.1);
        System.out.println(g1.toString());
        System.out.println(g2.toString());
        System.out.println(g3.toString());
    }
}
