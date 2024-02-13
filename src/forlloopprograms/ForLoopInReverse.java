package forlloopprograms;

public class ForLoopInReverse {public static void main(String[] args){

    int num =123456789;
    int reverseNumber =0;

    for(;num!=0;num/=10){
        int lastNumber =num%10;
        reverseNumber =reverseNumber*10+lastNumber;

    }
    System.out.println(reverseNumber);
}
}
