package priklad2;


import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Map map = new Map();
        Car t1 = new Car();
        Car t2 = new Car();
        Car t3 = new Car();
        Car t4 = new Car();

        map.addAuto(t1);
        map.addAuto(t2);
        map.addAuto(t3);
        map.addAuto(t4);

        t1.setName("BMW");          // nazov auta
        t2.setName("Audi");
        t3.setName("Skoda");
        t4.setName("Vrak");

        map.getPocetAut();

        System.out.println("Pocet aut vo vektore: " + map.getPocetAut());           // vypis velkosti vektoru

        //map.removeAuto(2);
        System.out.println("Dostanem auto 2: " + map.getAuto(1).getName());

    }

}
