public static void main(string [] args)
    {
        // Buat program Java yang mengurutkan data dari terbesar ke terkecil menggunakan Counting Sort, Tentukan sendiri nilai untuk variabel (misal): a1, a2, a3, a4, a5, a6, a7, a8 minimal 8 elemen).
        int a1 = 14;
        int a2 = 3;
        int a3 = 9;
        int a4 = 7;
        int a5 = 1;
        int a6 = 11;
        int a7 = 5;
        int a8 = 12;
        int[] arr = {a1, a2, a3, a4, a5, a6, a7, a8};
        system.out.println("Array sebelum diurutkan: ");
        for (int i = 0; i < arr.length; i++) {
            system.out.print(arr[i] + " ");
        }
        system.out.println();

        countingSort(arr);
        system.out.println("Array setelah diurutkan: ");
        printArray(arr);
    }

    static void countingSort(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                        max = arr[i];
                    }
                }
                int[] count = new int[max + 1];
                for (int i = 0; i < arr.length; i++) {
                    count[arr[i]]++;
                }
                int index = 0;
                for (int i = max; i >= 0; i--) {
                    while (count[i] > 0) {
                        arr[index++] = i;
                        count[i]--;
                    }
                }
            }   

            static void printArray(int[] arr) {
                for (int i = 0; i < arr.length; i++) {
                    system.out.print(arr[i] + " ");
                }
                system.out.println();
            }
        }


    