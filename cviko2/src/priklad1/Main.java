package priklad1;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Map map = new Map();
        Car t1 = new Car();
        Car t2 = new Car();
        Car t3 = new Car();
        Car t4 = new Car();
        /*
        Vector<Car> vektor = new Vector<Car>();     // zadefinovanie vektoru
        vektor.add(new Car());                      //pridanie do vektoru
        vektor.add(new Car());
        vektor.add(new Car());
        vektor.add(new Car());
        */

        t1.setName("BMW");          // nazov auta
        t2.setName("Audi");
        t3.setName("Skoda");
        t4.setName("Vrak");


        map.setA1(t1);              //priradim hodnoty natvrdo hodnoty t1 az t4 co som vytvoril k hodnotam mapy
        map.setA2(t2);
        map.setA3(t3);
        map.setA4(t4);
        /*
        System.out.println("Pocet aut vo vektore: " + vektor.size());           // vypis velkosti vektoru
        */
        System.out.println("meno je:" + t1.getName());      //test ci vypise meno auta

    }

}
