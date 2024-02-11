package forlloopprograms;

public class pyramid3 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i<=n; i++) {
            for (int j=n-i; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
