import javax.tools.JavaFileManager;
import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        float a = scanner.nextFloat();
        System.out.println("Enter 2nd Number");
        float b = scanner.nextFloat();
        System.out.println("Enter 3rd Number");
        float c = scanner.nextFloat();
        System.out.println("Bigger number is");

        if(a>=b&&a>=c){
            System.out.println("1st number");
        }else if(b>=a&&b>=c){
            System.out.println("2nd number");
        }else{
            System.out.println("3rd number");
        }
    }
}