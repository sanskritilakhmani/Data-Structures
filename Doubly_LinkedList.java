class DoublyLinkedList {
    class Node{
        int item;
        Node previous;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }
    Node head, tail = null;
    public void addNode(int item) {
        Node newNode = new Node(item);
        if(head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    private boolean isArmstrong(int num) {
        int a = 0, x = num;
        while (num > 0) {
            a = a + (int) Math.pow((num % 10), 3);
            num = num / 10;
        }
        if (x == a)
            return true;
        else
            return false;
    }
    public int printArmstrong() {
        Node current = head;
        int count = 0;
        if(head == null) {
            return 0;
        }
        while(current != null) {
            if (isArmstrong(current.item))
                count++;
        }
        return count;
    }
}
class Main{
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addNode(10);
        doublyLinkedList.addNode(20);
        doublyLinkedList.addNode(30);
        doublyLinkedList.addNode(40);
        doublyLinkedList.addNode(50);
        
        System.out.println("\n" + doublyLinkedList.printArmstrong());
    }
}
