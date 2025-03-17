package CSA.UnitSix.GradeBook;

public class Student 
{
  private String myName;
  private Grades myGrades;
	
  //constructors
  public Student(String m, double [] list)
  {
    myName = m;
    myGrades = new Grades(list);
  }	 
  public void setName(String name)
  {
    myName = name;
  }	
	
  public void setGrade(int spot, double grade)
  {
    myGrades.setGrade(spot,grade);
  }
	
  public int getNumGrades(){
    return myGrades.getNumGrades();
  }
  
  public double getSum(){
    return myGrades.getSum();
  }

  public double getAverage(){
    if (getNumGrades() > 0)
    {
        return getSum()/getNumGrades();
    }
    return 0.0;
  }

  public double getAverageMinusLow(){
    if (getNumGrades() > 1)
    {
        return (getSum()-getLowGrade())/(getNumGrades()-1);   
    }
    return 0.0;
  }
	
  public double getHighGrade(){
    return myGrades.getHighGrade();		
  }
	
  public double getLowGrade(){
    return myGrades.getLowGrade();		
  }	

    
}
