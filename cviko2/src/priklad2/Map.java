package priklad2;


import java.util.Vector;

public class Map {          //vektor

    private Vector<Car> auta = new Vector<Car>();

    public void addAuto(Car a1){
            this.auta.add(a1);
    }

    public Car getAuto(int index){
        return auta.get(index);
    }

    public void removeAuto(int index){
        auta.remove(index);
    }

    public int getPocetAut(){
        auta.size();
        return auta.size();

    }

}
