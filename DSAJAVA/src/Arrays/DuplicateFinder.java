package Arrays;

import java.util.HashSet;

public class DuplicateFinder {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 3, 7, 5, 9};

        HashSet<Integer> seen = new HashSet<>();
        System.out.println("Duplicate elements:");
        for (int num : arr) {
            if (!seen.add(num)) {
                System.out.println(num);
            }
        }
    }
}

