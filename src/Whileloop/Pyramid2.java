package Whileloop;

public class Pyramid2 {
    public static void main(String[] args){
        int i ,j;
        int k=4;
        int n =4;
        for(i=1;i<=4;i++){
            for(j=1;j<=n;j++){
                System.out.print(j);
            }
            n--;
            System.out.println();
        }
    }
}
