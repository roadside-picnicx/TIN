package priklad1;

public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(7);
        t.insert(5);
        t.insert(14);
        t.insert(1);
        t.insert(6);
        t.insert(16);
        t.insert(10);
        System.out.println("Pre order:");
        t.preorder();
        System.out.println("\n");
        System.out.println("In order:");
        t.inorder();
        System.out.println("\n");
        System.out.println("Post order:");
        t.postorder();
        System.out.println("\n");
        System.out.println("Reverse pre order:");
        t.reversePreorder();
        System.out.println("\n");
        System.out.println("Reverse in order:");
        t.reverseInorder();
        System.out.println("\n");
        System.out.println("Reverse post order:");
        t.reversePostorder();
        System.out.println("\n");
        t.contains(55);
        t.contains(7);
        System.out.println("Listy:");
        t.getLeaves();


    }
}