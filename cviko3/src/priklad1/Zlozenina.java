package priklad1;

import javax.imageio.event.IIOReadProgressListener;
import java.util.Iterator;
import java.util.LinkedList;

public class Zlozenina extends GrObjekt{

    private LinkedList<GrObjekt> objekty = new LinkedList<>(); //list kde sa pridavaju uvary

    public Zlozenina(int x, int y) {        // konstruktor
        super(x, y);
    }

    public void pridaj(GrObjekt o){
        this.objekty.add(o);
    }

    @Override
    public void vykresli() {
        System.out.println("Vykreslujem zlozeninu: " + this.getX()+ ", " + this.getY());
        for (GrObjekt o: objekty){
            o.vykresli();
        }
    }
}
