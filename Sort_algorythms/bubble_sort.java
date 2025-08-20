public class bubble_sort {
    public static void main(String[] args) {
        
        int [] numbers = {7, 8 ,20, 44, 123, 70, 21, 15, 300, 1};

        int length = numbers.length;
        
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length - 1 - i; j++){
                if (numbers[j] > numbers[j + 1]) {
                    int aux = numbers[j];        
                    numbers[j] = numbers[j + 1];   
                    numbers[j + 1] = aux;
                }
            }
        }

        for(int i = 0; i < length; i++){
            System.out.print(numbers[i] + " ");
        }

    }
}
