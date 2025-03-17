package CSA.UnitSix.GradeBook;
import java.util.Arrays;

public class Grades {
    private Grade[] grades;
    public Grades( double[] list )
    {	
        grades = new Grade[list.length];
        for (int i = 0; i < list.length; i++)
        {
            grades[i] = new Grade(list[i]);
        }
    }
  
    public void setGrade(int pos, double grade)
    {
        if (pos >= 0 && pos < grades.length)
        {
            grades[pos] = new Grade(grade);
        }
    }
  
    public double getSum()
    {
      double sum = 0;
      for (Grade num : grades)
      {
        sum += num.getNumericGrade();
      }  
      return sum;
    }
    
    public double getLowGrade()
    {
      double min = grades[0].getNumericGrade();
      for (Grade val : grades)
      {
        if (val.getNumericGrade() < min)
        {
            min = val.getNumericGrade();
        }
      }
      return min;
    }
  
    public double getHighGrade()
    {
      double max = grades[0].getNumericGrade();
      for (Grade integers : grades)
      {
        if (integers.getNumericGrade() > max)
        {
            max = integers.getNumericGrade();
        }
      }
      return max;
    }
  
    public int getNumGrades()
    {
      return grades.length;
    }
  
    public String toString()
    {
        return Arrays.toString(grades);
    }	
  
}
