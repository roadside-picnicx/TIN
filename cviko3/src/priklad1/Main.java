package priklad1;

public class Main {
    public static void main(String[] args) {

        Platno p = new Platno(800, 600); //nove platno
        p.pridajDoPlatna(new Kruh(20,30,5));
        p.pridajDoPlatna(new Kruh(40,25,7));
        p.pridajDoPlatna(new Stvorec(20,30,5));

        Zlozenina s = new Zlozenina(50,50);     //nova zlozenina kde pridaavam veci
        s.pridaj(new Kruh(10,20,5));
        s.pridaj(new Stvorec(5,5,5));

        p.pridajDoPlatna(s);       // pridam zlozeninu do platna

        p.vytvorRaster(); //volam funkciu vytvor raster co vsetko vypise
    }

}