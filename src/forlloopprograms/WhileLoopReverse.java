package forlloopprograms;

public class WhileLoopReverse {
    public static void main(String[] args){
        int n=786,lastDigit;
        int rev=0;
       while(n!=0){
           lastDigit=n%10;
           rev = rev * 10 + lastDigit;
           n=n/10;
       }
        System.out.println(rev);
    }   
}
