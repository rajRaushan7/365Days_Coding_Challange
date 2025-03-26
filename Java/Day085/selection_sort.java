package Java.Day085;

class selection_sort {
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int turn = 0; turn < n-1; turn++) {
            int minPos = turn;
            for (int j = turn + 1; j < n; j++) {
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = arr[turn];
            arr[turn] = arr[minPos];
            arr[minPos] = temp;
        }
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 2, 3};
        selectionSort(arr);
        printArr(arr);
    }
}