package priklad5;

public class Main {
    public static void main(String[] args) {
        Node n1 = new Node();
        n1.setName("1");
        Node n2 = new Node();
        n2.setName("2");
        Node n3 = new Node();
        n3.setName("3");
        Node n4 = new Node();
        n4.setName("4");
        Node n5 = new Node();
        n5.setName("5");
        Node n6 = new Node();
        n6.setName("6");

        n1.addNode(n4);
        n1.addNode(n5);
        n1.addNode(n6);
        n2.addNode(n1);
        n2.addNode(n5);
        n2.addNode(n3);
        n5.addNode(n4);

        System.out.println("Pocet susednych uzlov N1 je: " + n1.getNodes());
        System.out.println("Susedne nodes pre N1 su:");
        n1.printNodes();

    }
}
