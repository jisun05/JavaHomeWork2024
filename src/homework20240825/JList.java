package homework20240825;

public class JList {

    int size = 0;
    Node head;

    public JList() {
        this.head = null;
        this.size = 0;
    }


    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }


    }


    public void remove(int data) {

    }

    public boolean search(int data) {
        return false;
    }


    public void printList() {


    }

}



