public class SmallestElement {
    public static void main(String[] args){
        int[] numbers={20,82,1,10,8};
        int smallest=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        System.out.println(smallest);
    }

}
