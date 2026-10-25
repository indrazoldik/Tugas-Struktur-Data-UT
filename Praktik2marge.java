public static void main(string[] args)
    {
        // Buat program Java yang mengurutkan data dari terbesar ke terkecil menggunakan Merge Sort, Tentukan sendiri nilai untuk variabel (misal): a1, a2, a3, a4, a5, a6, a7, a8 (minimal 8 elemen).
        int a1 = 14;
        int a2 = 3;
        int a3 = 9;
        int a4 = 7;
        int a5 = 1;
        int a6 = 11;
        int a7 = 5;
        int a8 = 12;
        int[] arr = {a1, a2, a3, a4, a5, a6, a7, a8};
        System.out.println("Array sebelum diurutkan: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Array setelah diurutkan dari terbesar ke terkecil: ");      
        printArray(arr);    
        


        static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right); 
            merge(arr, left, mid, right);
        }

        static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] > rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }

        static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }