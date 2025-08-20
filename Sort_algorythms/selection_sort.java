public class selection_sort {
    public static void main(String[] args) {
        
        int [] numbers = {50,90,80,202,10,3,24,77,56,300};

        int length = numbers.length;

        for(int i = 0; i < length; i++){
            int min_idx = i;
            for(int j = i + 1; j < length; j++){
                if (numbers[min_idx] > numbers[j]) {
                    min_idx = j;
                }
            }
              int temp = numbers[i];
              numbers[i] = numbers[min_idx];
              numbers[min_idx] = temp;
        }

        for(int i = 0; i < length; i++){           
            System.out.print(numbers[i] + " ");
        }

    }
}
