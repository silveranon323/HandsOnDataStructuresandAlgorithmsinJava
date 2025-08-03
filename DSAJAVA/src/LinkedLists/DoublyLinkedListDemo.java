package LinkedLists;


import java.util.LinkedList;

public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");

        list.addFirst("Yellow");
        list.addLast("Purple");

        System.out.println("Doubly Linked List Elements:");
        for (String color : list) {
            System.out.println(color);
        }

        list.removeFirst();
        list.removeLast();

        System.out.println("After Removing First and Last:");
        for (String color : list) {
            System.out.println(color);
        }
    }
}
