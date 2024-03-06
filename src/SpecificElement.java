import java.util.Scanner;

public class SpecificElement {
    public static void main(String[] args){
        int[] numbers ={20,30,8,100,120};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Element ");
        int target = scanner.nextInt();
        for(int i=0;i< numbers.length;i++){
            if (numbers[i] == target){
                System.out.println(numbers[i]);
                break;
            }
        }
        System.out.println("Element is not found in the Array ");
    }
}
