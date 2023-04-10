package priklad2;

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean hasNext(){       // zistuje ci ma dalsiu
        if (next == null){
            return false;
        }
        return true;
    }
}
