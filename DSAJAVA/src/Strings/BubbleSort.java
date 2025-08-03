package Strings;

public class BubbleSort {
    public static void main(String[] args) {
        String[] arr = {"banana", "Apple", "grape", "Mango", "cherry", "orange", "Blueberry", "fig", "kiwi", "Date"};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (String word : arr) {
            System.out.println(word);
        }
    }
}
