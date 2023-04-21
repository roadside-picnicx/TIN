package cz.vutbr.feec.ga;

public class Main {

    public static void main(String[] args) {
        Population p = new Population(50);
        for (int i = 0; i < 10000; i++) {
            p.mutate(1,10);
            p.crossover(100);
            p.select();
            if(i%20==0)
                p.show();

        }
    }

}
