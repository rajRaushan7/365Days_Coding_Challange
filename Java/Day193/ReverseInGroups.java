package Java.Day193;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseInGroups {

    public static void main(String[] args) {
        Node head = createList(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        int k = 3;
        head = reverseInGroups(head, k);
        printList(head);
    }

    public static Node reverseInGroups(Node head, int k) {
        Node current = head;
        Node prev = null;
        Node next = null;

        int count = 0;

        // Reverse first k nodes
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        // head is now the last node in this group
        if (next != null) {
            head.next = reverseInGroups(next, k);
        }

        return prev;
    }

    public static Node createList(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + (head.next != null ? " → " : ""));
            head = head.next;
        }
        System.out.println();
    }
}