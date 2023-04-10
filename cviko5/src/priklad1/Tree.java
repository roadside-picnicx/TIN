package priklad1;

public class Tree {
    private Node root;      // root

    public void insert(int data){
        if (root == null)               // ked neni root tak vytvori
            root = new Node(data);
        else {                          // ak root existuje tak rozdeli
            order(root, data);
        }
        System.out.println("root node is:"+ Integer.toString(root.getData()));
    }


    public void order(Node node, int data) {           //rozdelenie dolava/doprava

        if (data < node.getData()) {        //ak je pridavana hodnota mensia tak ide dolava
            if (node.getLeft() != null)
                order(node.getLeft(), data);    // rekurzia
            else {
                System.out.println("inserted node: " + data + " left of: " + node.getData());
                node.setLeft(new Node(data));
            }
        } else if (data > node.getData()) {     //ak je pridavana hodnota vacsia tak ide doprava
            if (node.getRight() != null)
                order(node.getRight(), data);   // rekurzia
            else {
                System.out.println("inserted node: " + data + " right of: " + node.getData());
                node.setRight(new Node(data));
            }
        }

    }


    public void preorder(Node node) {      //zoradi zoznam predtym nez bol zoradeny do stromu
        if (node == null){
            return;
        }
        System.out.print(node.getData() + " ");
        preorder(node.getLeft());
        preorder(node.getRight());
    }

    public void preorder(){
        preorder(root);
    }

    public void inorder(Node node) {               // zoradi zoznam podla ciselnej postupnosti
        if (node == null)
            return;
        inorder(node.getLeft());
        System.out.print(node.getData() + " ");
        inorder(node.getRight());
    }

    public void inorder(){
        inorder(root);
    }

    public void postorder(Node node) {               // zoradi zoznam podla rozdelenia v binarnom strome
        if (node == null)
            return;
        postorder(node.getLeft());
        postorder(node.getRight());
        System.out.print(node.getData() + " ");
    }

    public void postorder(){
        postorder(root);
    }

    void contains(int data) {           //metoda ci strom obasuje data
        System.out.println("Obsahuje cislo "+data+ " ? " +contains(root, data));
    }

    public boolean contains(Node node, int i) {     // ak neobsahuje false
        if (node == null) return false;
        if (node.getData() == i) return true;       //ak obsahuje true
        return contains(node.getLeft(), i) || contains(node.getRight(), i);
    }

    public void reversePreorder(Node node) {
        if (node == null)
            return;

        reversePreorder(node.getRight());
        reversePreorder(node.getLeft());
        System.out.print(node.getData() + " ");
    }

    public void reversePreorder(){
        reversePreorder(root);
    }

    public void reverseInorder(Node node) {
        if (node == null)
            return;

        reverseInorder(node.getRight());
        System.out.print(node.getData() + " ");
        reverseInorder(node.getLeft());
    }

    public void reverseInorder(){
        reverseInorder(root);
    }

    public void reversePostorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.getData() + " ");
        reversePostorder(node.getRight());
        reversePostorder(node.getLeft());
    }

    public void reversePostorder(){
        reversePostorder(root);
    }

    void getLeaves() {
        getLeaves(root);
    }

    public void getLeaves(Node node) {
        if (root == null) {
            return;
        }
        if (node.getLeft() == null && node.getRight() == null)
            System.out.print(node.getData()+" ");
        if (node.getLeft() != null)
            getLeaves(node.getLeft());
        if (node.getRight() != null)
            getLeaves(node.getRight());

    }

}
