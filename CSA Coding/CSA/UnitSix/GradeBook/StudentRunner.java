package CSA.UnitSix.GradeBook;

public class StudentRunner 
{
    public static void main(String [] args)
    {
        double [] gradebilly = {90, 85, 95.5, 77.5, 88};
        Student s1 = new Student("Billy Bob", gradebilly);
        System.out.println("sum = " + s1.getSum());
        System.out.println("average = " + s1.getAverage());
        System.out.println("average - low = " + s1.getAverageMinusLow());
        System.out.println("low grade = " + s1.getLowGrade());
        System.out.println("high grade = " + s1.getHighGrade());
        double [] gradesally = {100, 100, 99};
        Student s2 = new Student("Sally Sue", gradesally);
        System.out.println("sum = " + s2.getSum());
        System.out.println("average = " + s2.getAverage());
        System.out.println("average - low = " + s2.getAverageMinusLow());
        System.out.println("low grade = " + s2.getLowGrade());
        System.out.println("high grade = " + s2.getHighGrade());


    }
    
}
