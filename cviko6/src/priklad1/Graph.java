package priklad1;

import java.util.HashMap;

public class Graph {

    public HashMap<Integer, Vertex> vertexSet = new HashMap<Integer, Vertex>();     //hash mapa co uklada vrchol


    public void add(int label1, int label2, int cost ){           //spojenie vrcholov a pridanie ceny, nazov1 do nazov2 a cena
        Vertex v1 = vertexSet.get(label1);
        Vertex v2 = vertexSet.get(label2);
        if(v1 == null){
            v1= new Vertex(label1);                 //vytvori novy vrchol 1
            vertexSet.put(label1, v1);
        }
        if(v2 == null){                             //vytvori novy vrchol 2
            v2 = new Vertex(label2);
            vertexSet.put(label2, v2);
        }
        v1.connect(v2, cost);           //spoji vrchol 1 s 2 a uda im cenu
        v2.connect(v1, cost);           //ditto ale vice versa
    }
    public Vertex getVertex(int label){         //getter pre vrchol, jeho nazov napr. 1, 2, atd.
        return vertexSet.get(label);
    }



}