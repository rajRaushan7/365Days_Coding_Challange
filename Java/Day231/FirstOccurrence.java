public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 3, 9};
        int key = 3;

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break; // पहला मिलते ही रुक जाओ
            }
        }

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("First occurrence of " + key + " is at index: " + index);
        }
    }
}
