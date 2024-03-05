import java.util.Arrays;

public class SmallestAndLargestElement {
    public static void main(String[] args){
        int[] numbers ={20,50,10,11,100,120};

        for(int num : numbers){
            if(num % 2==1) {
                System.out.println(num);
            }
        }

        int largest   =numbers[0];
        int smallest  =numbers[0];

        for(int i=1;i< numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
            }
        }
        System.out.println("the largest number is "+ largest);
        System.out.println("the largest number is "+ smallest);
    }
}
