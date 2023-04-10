package priklad1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Path {

    private List<Vertex> vertexes = new ArrayList<>();      //vrcholy
    private int cost = 0;       //pociatocna cena
    private Graph graph;

    public Path(Graph graph, int label) {           //konstruktor cesty, nazov grafu a prvy vrchol od ktoreho sa zacina
        this.graph = graph;
        vertexes.add(graph.getVertex(label));
    }

    public Path addVertex(int label) {                  //pridanie vrcholov do cesty
        Vertex vertex = graph.getVertex(label);
        Vertex lastVertex = vertexes.get(vertexes.size() - 1);      //posledny vrchol
        vertexes.add(vertex);
        cost += lastVertex.getCost(vertex);         //pripocita cenu posldneho vrcholu k pociatocnej cene
        return this;

    }

    public void printCost() {           //printuje cost
        System.out.println(cost);
    }

}