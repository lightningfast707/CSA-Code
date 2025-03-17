package CSA.UnitSix.GradeBook;

public class GradesRunner 
{
    public static void main(String [] args)
    {
        double [] list1 = {90, 85, 95.5, 77.5, 88};
        double [] list2 = {10, 70, 90, 92.5, 85, 95.5, 77.5, 88, 100.0};
        Grades g1 = new Grades(list1);
        System.out.println(g1.toString());
        System.out.println("sum = " + g1.getSum());
        System.out.println("num grades = " + g1.getNumGrades());
        System.out.println("low grade = " + g1.getLowGrade());
        System.out.println("high grade = " + g1.getHighGrade());
        Grades g2 = new Grades(list2);
        System.out.println(g2.toString());
        System.out.println("sum = " + g2.getSum());
        System.out.println("num grades = " + g2.getNumGrades());
        System.out.println("low grade = " + g2.getLowGrade());
        System.out.println("high grade = " + g2.getHighGrade());
    }
    
}
