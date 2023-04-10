package priklad2;

public class Main {
    public static void main(String[] args) {
        Map map = new Map();        //nova mapa
        Car t1 = new Car();         // 4 nove objekty car
        Car t2 = new Car();
        Car t3 = new Car();
        Car t4 = new Car();

        map.a1 = t1;    //priradim hodnoty natvrdo hodnoty t1 az t4 co som vytvoril k hodnotam mapy
        map.a2 = t2;
        map.a3 = t3;
        map.a4 = t4;
    }
}
