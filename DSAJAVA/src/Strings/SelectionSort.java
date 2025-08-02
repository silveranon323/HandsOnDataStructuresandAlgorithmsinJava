package Strings;

public class SelectionSort {
    public static void main(String[] args) {
        String[] words = {"banana", "Apple", "grape", "Mango", "cherry", "orange", "Blueberry", "fig", "kiwi", "Date"};

        for (int i = 0; i < words.length - 1; i++) {
            int minIndex = i; // start with the current index as minimum
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].compareTo(words[minIndex]) < 0) {
                    minIndex = j; // update minIndex if smaller string found
                }
            }


            String temp = words[i];
            words[i] = words[minIndex];
            words[minIndex] = temp;
        }


        System.out.println("Sorted Strings:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
