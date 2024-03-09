package localvariable;

public class LocalVariableExample2 {
    public static void main(String[] args){
        int x = 10;
        String var ="Hello World";

        System.out.println("x is "+ x );
        System.out.println("var is "+ var );

        if(x>5){
            String result ="x is greater than 5 ";//result is local variable
            System.out.println(result);

        }

       for(int i=0;i<3;i++){
           String loop ="iteration ";
           System.out.println(loop + i);//loop is local variable

       }
    }
}
