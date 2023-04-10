package priklad4;

public class Main {
    public static void main(String[] args) {
        Adresar a1 = new Adresar();                 // vytvorim 5 adresarov
        a1.setName("adresar1");
        Adresar a2 = new Adresar();
        a2.setName("adresar2");
        Adresar a3 = new Adresar();
        a3.setName("adresar3");
        Adresar a4 = new Adresar();
        a4.setName("adresar4");
        Adresar a5 = new Adresar();
        a5.setName("adresar5");

        a1.setPodadresarLeft(a4);        // pridelim adresare lavy a pravy adrsaru 1
        a1.setPodadresarRight(a2);

        a2.setPodadresarLeft(a5);         //  pridelim adresare lavy a pravy adrsaru 2, je to podla obrazka zadania
        a2.setPodadresarRight(a3);

        System.out.println("Podadresare adresara 1 su: " + a1.getPodadresarLeft().getName() +" a "+ a1.getPodadresarRight().getName());
        System.out.println("Podadresare adresara 2 su: " + a2.getPodadresarLeft().getName() +" a "+ a2.getPodadresarRight().getName());
    }
}
