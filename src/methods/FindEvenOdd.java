package methods;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        EvenOdd(num);
    }

    public static void EvenOdd(int num) {
        if(num%2==0){
            System.out.println("even number is "+ num);
        }else{
            System.out.println("odd number is "+ num);
        }

    }
}
