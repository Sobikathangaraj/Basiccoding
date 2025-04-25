class Main {
     public static void quicksort(int arr[], int l, int r) {
         if (l > r) return;
         int pivot = arr[l];
         int i = l + 1;
         int j = r;
         while (i <= j) {
             while (i <= r && arr[i] <= pivot) {
                 i++;
             }

             while (j >= l && arr[j] > pivot) {
                 j--;
             }
             if (i < j) {
                 int t = arr[i];
                 arr[i] = arr[j];
                 arr[j] = t;
                 i++;
                 j--;
             }
         }
         int t = arr[l];
         arr[l] = arr[j];
         arr[j] = t;
         quicksort(arr, l, j - 1);  // now end as pivot
         quicksort(arr, j + 1, r);

     }

     public static void main(String[] args) {

         int arr[] = {1, 23, 5, 43, 22, 7};
         int n = arr.length;
         quicksort(arr, 0, n - 1);
         for (int num : arr) {
             System.out.print(num + " ");
         }
     }
 }

