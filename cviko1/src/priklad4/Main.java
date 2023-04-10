package priklad4;

public class Main {
    public static void main(String[] args) {
        Adresar a1 = new Adresar();                 // vytvorim 5 adresarov
        a1.name = "Adresar 1";
        Adresar a2 = new Adresar();
        a2.name = "Adresar 2";
        Adresar a3 = new Adresar();
        a3.name = "Adresar 3";
        Adresar a4 = new Adresar();
        a4.name = "Adresar 4";
        Adresar a5 = new Adresar();
        a5.name = "Adresar 5";

        a1.podadresarLeft = a4;         // pridelim adresare lavy a pravy adrsaru 1
        a1.podadresarRight = a2;

        a2.podadresarLeft = a5;         //  pridelim adresare lavy a pravy adrsaru 2, je to podla obrazka zadania
        a2.podadresarRight = a3;

        System.out.println("Podadresare adresara 1 su: " + a1.podadresarLeft.name +" a "+ a1.podadresarRight.name);
        System.out.println("Podadresare adresara 2 su: " + a2.podadresarLeft.name +" a "+ a2.podadresarRight.name);
    }
}
