import java.util.Scanner;

public class Exponents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a base: ");
        int base = scanner.nextInt();
        System.out.print("Enter an exponent: ");
        int exponent = scanner.nextInt();
        
        int total = 1; 
        int i = 0;
        while (i < exponent) {
            total *= base;
            i++;
        }
        System.out.println("Output is: " + total);
    }
}
