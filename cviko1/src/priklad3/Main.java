package priklad3;

public class Main {
    public static void main(String[] args) {        // program co musi vypisat suseda packetov, zas nezrozumitelne zadanie
        Packet packet1 = new Packet();
        packet1.name = "Packet 1";
        Packet packet2 = new Packet();
        packet2.name = "Packet 2";
        Packet packet3 = new Packet();
        packet3.name = "Packet 3";
        Packet packet4 = new Packet();
        packet4.name = "Packet 4";

        packet1.next = packet2;
        packet2.next = packet3;
        packet3.next = packet4;
        packet4.next = packet1;

        System.out.println(packet1.name);                   // vypisuje jaky packet ide po akom
        System.out.println(packet1.next.name);
        System.out.println(packet1.next.next.name);
        System.out.println(packet1.next.next.next.name);
        System.out.println(packet1.next.next.next.next.name);  // nakoniec sa musi spojit a dalsi v poradi po 4 musi byt 1
    }
}
