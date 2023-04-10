package priklad1;

public class Node {
    private int data;
    private Node left;          //pravy a lavy node
    private Node right;

    public Node(int data) {         // su null v konstruktor
        this.data = data;
        right = null;
        left = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
