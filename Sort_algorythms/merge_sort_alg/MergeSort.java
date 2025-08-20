    package merge_sort_alg;

    public class MergeSort {
    
        public void sort (int [] numbers, int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;

                sort(numbers, left, mid);
                sort(numbers, mid + 1, right);

                merge(numbers, left, mid, right);
            }
        }

        private void merge(int [] numbers, int left, int mid, int right){
            int n1 = mid - left + 1;
            int n2 = right - mid;

            int [] L = new int [n1];
            int [] R = new int [n2];

            for(int i = 0; i < n1; i++) {
                L[i] = numbers[left + i];
            }
            for(int j = 0; j < n2; j++) {
                R[j] = numbers[mid + 1 + j];
            }


            int i = 0, j = 0, k = left;

            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    numbers[k++] = L[i++];
                }else{
                    numbers[k++] = R[j++];
                }
            }

            while (i < n1) {
                numbers[k++] = L[i++];
            }
            while (j < n2) {
                numbers[k++] = R[j++];
            }
        }
    }
