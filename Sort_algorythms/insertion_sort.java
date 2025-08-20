public class insertion_sort {
    public static void main(String[] args) {
        
        int[] numbers = {8, 15, 32, 9, 99, 66, 13, 22, 87, 1};

        int length = numbers.length;

        for (int i = 1; i < length; i++) {
            int current = numbers[i];

            int j = i - 1;
            while (j >= 0 && numbers[j] > current) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = current;
        }

        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }
    }
}
