package Whileloop;

public class Pyramid4 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 0; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
