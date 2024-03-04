public class SumArray {
    public static void main(String[] args){
        int[] numbers={10,30,20,50,70};
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}
