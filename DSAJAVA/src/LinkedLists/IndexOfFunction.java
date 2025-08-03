package LinkedLists;

public class IndexOfFunction {
    public static void main(String[] args) {
        String str = "welcome to java";
        String target = "java";
        int index = customIndexOf(str, target);
        System.out.println("Index of \"" + target + "\" is: " + index);
    }

    static int customIndexOf(String str, String target) {
        int len1 = str.length();
        int len2 = target.length();
        for (int i = 0; i <= len1 - len2; i++) {
            if (str.substring(i, i + len2).equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
