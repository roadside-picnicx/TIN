package priklad5;

import priklad2.Car;


import java.util.Vector;

public class Node {

    private Vector<Node> uzly = new Vector<Node>();//vector uzlov
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNode(Node n){
        uzly.add(n);
    }

    public int getNodes(){
        return uzly.size();
    }

    public void printNodes(){
        for(Node n: uzly)
        System.out.println(n.getName());
    }

}
