public class Exercise2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(countOddNumbers(numbers));
    }

    public static int countOddNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (num % 2 != 0) {
                count++;
            }
        }

        return count;
    }
}
