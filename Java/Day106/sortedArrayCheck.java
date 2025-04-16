class sortedArrayCheck {
    public static boolean sortedCheck(int[] arr, int i){
        if(i == (arr.length -1)){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return sortedCheck(arr, i+1);
    }

    public static void main(String[] args){
        int arr[] = {1,3, 5, 6, 7, 8, 9};
        int arr2[] = {5, 2, 4, 6, 7, 2, 6, 3};

        System.out.println(sortedCheck(arr, 0));
        System.out.println(sortedCheck(arr2, 0));
    }
}