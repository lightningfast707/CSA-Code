import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter a start number:");
        int s = keyboard.nextInt();
        System.out.print("Enter an end number:");
        int e = keyboard.nextInt();
        System.out.println("Multiplication table for " + s);
        for (int i = 1; i <= e; i++)
        {
            System.out.println(i +"   " + "    " + "   " + i*s);

        }
        
    }
}