package priklad3;

public class Main {
    public static void main(String[] args) {
        Packet packet1 = new Packet();
        packet1.setName("packet1");
        Packet packet2 = new Packet();
        packet2.setName("packet2");
        Packet packet3 = new Packet();
        packet3.setName("packet3");
        Packet packet4 = new Packet();
        packet4.setName("packet4");

        packet1.setNext(packet2);
        packet2.setNext(packet4);
        packet3.setNext(packet4);
        packet4.setNext(packet1);

        System.out.println(packet1.getName());                   // vypisuje jaky packet ide po akom
        System.out.println(packet1.getNext().getName());
        System.out.println(packet1.getNext().getNext().getName());
        System.out.println(packet1.getNext().getNext().getNext().getName()); // nakoniec sa musi spojit a dalsi v poradi po 4 musi byt 1
    }
}
