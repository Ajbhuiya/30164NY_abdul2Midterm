/*
package algorithm;

public class Sort {

    long executionTime = 0;
	*/
/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 *//*



    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int n = list.length;
        for (int i = 1; i < n; ++i) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public void mergeSort(int[] array, int i, int i1) {
        int[] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();
    }



    public int [] quickSort(int[] array, int i, int i1){
        int [] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();
        if (i < i1) {

            int pi = partition(list, i, i1);

            quickSort(list, i, pi - 1);
            quickSort(list, pi + 1, i1);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    private int partition(int[] list, int i, int i1) {

        public int[] heapSort ( int[] array);
            int[] list = array;
            //implement here
        }
    }




    public int [] bucketSort(int[] array, int i){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public int[] shellSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int n = list.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = list[i];
                int j;
                for (j = i; j >= gap && list[j - gap] > temp; j -= gap) {
                    list[j] = list[j - gap];
                }
                list[j] = temp;
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}*/
