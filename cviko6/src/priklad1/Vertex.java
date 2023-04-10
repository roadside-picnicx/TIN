package priklad1;

import java.util.HashMap;

public class Vertex {           //vrchol
    private int label;          //nazov
    private HashMap<Vertex, Integer> costs = new HashMap<>();         // cena

    public Vertex(int label) {                      //konstruktor vrchol
        this.costs = costs;
        this.label = label;
    }

    public void setLabel(int label) {           //setter label
        this.label = label;
    }


    public void setCosts(HashMap<Vertex, Integer> costs) {      //setter pre cost
        this.costs = costs;
    }

    public int getCost(Vertex v1){      //getter cost
           return costs.get(v1);
        }

    public int getLabel() {         //getter label
        return label;
    }

    public  void connect(Vertex v2, int cost){  //spaja vrcholu dalsi vrchol a cenu
        costs.put(v2, cost);

    }
}