package priklad1;

public class Main {

    public static void main(String[] args) {
        Auto a1 = new Auto(); // objekt
        a1.cena = 100;
        a1.znacka = "Skoda";
        Auto a2 = new Auto();
        a2.cena = 500;
        a2.znacka = "Audi";
        Auto a3 = a1;
        Auto a4 = new Auto();
        a4.cena = 300;
        a4.znacka = "BMW";

        a1.left = a2; //ukazuje na to auto ktore je nalavo od neho, je hardcodnute ze nalavo od a1 je a2 XDD
        a2.left = a3;

        //4 objekty, 4 auta ez

        System.out.println("Cena auta 1 je:"+a1.cena +" a znacka je: "+a1.znacka);
        System.out.println("Cena auta 2 je:"+a2.cena +" a znacka je: "+a2.znacka);
        System.out.println("Cena auta 3 je:"+a3.cena +" a znacka je: "+a3.znacka);
        System.out.println("Cena auta 4 je:"+a4.cena +" a znacka je: "+a4.znacka);
        //System.out.println("Pezot je vergel");
        System.out.println("Nalavo od auta 1 je: "+ a1.left.znacka+ " s cenou "+ a1.left.cena);
        System.out.println("Nalavo od auta 2 je: "+ a2.left.znacka+ " s cenou "+ a2.left.cena);
    }
}