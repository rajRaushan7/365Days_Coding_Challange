package Java.Day165;

class DoubleLL {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add ( add first )
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size = 1;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;

    }

    // remove
    public void deleteFirst(){
        if (head == null) {
            System.out.println("DLL is empty");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    // print
    public void printLL() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        DoubleLL dll = new DoubleLL();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(0);

        dll.printLL();
        System.out.println("Size of Double LinkedList : " + size);
    }

}