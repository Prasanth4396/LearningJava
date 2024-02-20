package forlloopprograms;

import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args){
        int sum =0;
        int n;
        int i=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        n =scanner.nextInt();
        while(n>=0){
            sum=+i   ;
            i++;
            System.out.println(i);
        }
    }
}
