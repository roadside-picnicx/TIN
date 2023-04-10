package priklad1;

import java.util.ArrayList;

public class Platno {
    private int vyska;
    private int sirka;

    ArrayList<GrObjekt> obejkt = new ArrayList<>();

    public Platno(int vyska, int sirka) {
        this.vyska = vyska;
        this.sirka = sirka;
    }

    public int getVyska() {
        return vyska;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }

    public int getSirka() {
        return sirka;
    }

    public void setSirka(int sirka) {
        this.sirka = sirka;
    }

    public void vytvorRaster() {
        System.out.println("Vytvaram grid");
        for (GrObjekt o: obejkt){
            o.vykresli();
        }
    }

    public void pridajDoPlatna(GrObjekt o){
        this.obejkt.add(o);
    }
}
