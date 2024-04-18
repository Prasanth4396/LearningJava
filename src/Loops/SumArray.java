package Whileloop;

public class SumArray {
    public static void main(String[] args){
        int[] numbers ={20,80,70,90,100};
        int  sum=0;
        for(int i=0;i< numbers.length;i++){
            sum =sum+numbers[i];
        }
        System.out.println(sum);
    }
}
