package priklad1;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();                  //vytvorenie grafu s vrcholmi
        graph.add(1, 6, 6);         //pridanie ciest medzi vrcholmi a cena
        graph.add(6, 5, 5);
        graph.add(5, 4, 11);
        graph.add(4,3,9);
        graph.add(7,5,10);

        //pridanie hornych vrcholov
        graph.add(1,2,4);
        graph.add(2,3,24);
        graph.add(3,4,9);

        //pridanie spodnych vrcholov
        graph.add(1,7,16);
        graph.add(7,8,21);
        graph.add(8,4,7);


        Vertex v1 = graph.getVertex(5);
        Vertex v2 = graph.getVertex(4);
        System.out.println("Cena cesty medzi 5 a 4: ");
        System.out.println(v1.getCost(v2));// ziskanie ceny medzi dvoma vrcholmi
        Vertex v3 = graph.getVertex(7);
        Vertex v4 = graph.getVertex(5);
        System.out.println("Cena cesty medzi 7 a 5: ");
        System.out.println(v3.getCost(v4));

        //1 - 6 - 5 - 4 - 3
        Path path = new Path(graph, 1);     //vytvorenie cesty so zaciatkom v bode 1
        path.addVertex(6);                  //pridavam body
        path.addVertex(5);
        path.addVertex(4);
        path.addVertex(3);
        System.out.println("Cena cesty 1 - 6 - 5 - 4 - 3 je: ");
        path.printCost();                       //vypisem celkovu cestu

        //1 - 2 - 3 - 4
        Path upperPath = new Path(graph,1 );
        upperPath.addVertex(2);
        upperPath.addVertex(3);
        upperPath.addVertex(4);
        System.out.println("Cena cesty 1 - 2 - 2 - 4 je: ");
        upperPath.printCost();

        //1 - 7 - 8- 4
        Path lowerPath = new Path(graph,1 );
        lowerPath.addVertex(7);
        lowerPath.addVertex(8);
        lowerPath.addVertex(4);
        System.out.println("Cena cesty 1 - 7 - 8 - 4 - 3 je: ");
        lowerPath.printCost();

    }
}