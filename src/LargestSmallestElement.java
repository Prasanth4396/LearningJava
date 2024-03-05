public class LargestSmallestElement {
    public static void main(String[] args) {
        int[] numbers = {10, 30, 70, 40, 100};
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
               largest=numbers[i];
            }
        }
        System.out.print("largest number is "+ largest);
    }
}