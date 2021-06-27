class CircularQueue {
    int SIZE;
    int front, rear;
    int items[] = new int[SIZE];

    CircularQueue(int size) {
        this.SIZE = size;
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % SIZE;
            if (isOdd(element))
                items[rear] = element;
            else
                System.out.println("Element is not prime!!");
        }
    }

    boolean isOdd(int num) {
        if (num % 2 != 0)
            return true;
        return false;
    }

    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % SIZE;
            }
            return (element);
        }
    }

    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            for (i = front; i != rear; i = (i + 1) % SIZE)
                System.out.print(items[i] + " ");
            System.out.println(items[i]);
        }
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);
        q.deQueue();

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(6);

        q.display();

        int elem = q.deQueue();

        if (elem != -1) {
            System.out.println(elem);
        }
        q.display();
        q.enQueue(7);
        q.display();
        q.enQueue(8);
    }
}
