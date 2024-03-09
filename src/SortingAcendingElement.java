public class SortingAcendingElement {
    public static void main(String[] args) {
        int[] numbers = {44, 88, 22, 77, 99};
        int temp;

         for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }

        }
        for (int a : numbers) {
            System.out.print(a + " ");
        }
    }
}

