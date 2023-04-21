package cz.vutbr.feec.ga;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Population {
    private List<Chromozome> chromozomes = new ArrayList<>();


    public Population(int size){
        for (int i = 0; i < size ; i++) {
            Chromozome ch = new Chromozome();
            ch.mutateAll();
            chromozomes.add(ch);

        }
    }

    public void show(){
        int err = Integer.MAX_VALUE;
        Chromozome toShow = null;
        Fitness eval;
        try{
            eval = new Fitness("cz/vutbr/feec/ga/orloj.jpg");

        }catch (IOException e){
            e.printStackTrace();
            return;
        }
        for (Chromozome ch: chromozomes) {
            if (eval.getFitness(ch) < err){
                err = eval.getFitness(ch);
                toShow = ch;
            }

        }
        if(toShow!= null)
            ShowChromozome.show(toShow, "chrom");
    }

    public void select(){
        List<Chromozome> newChromozomes = new ArrayList<>();
        Fitness eval;
        try{
            eval = new Fitness("cz/vutbr/feec/ga/orloj.jpg");

        }catch (IOException e){
            e.printStackTrace();
            return;
        }
        for (int i = 0; i <chromozomes.size() ; i++) {
            Chromozome ch1 = chromozomes.get(new Random().nextInt(chromozomes.size()));
            Chromozome ch2 = chromozomes.get(new Random().nextInt(chromozomes.size()));
            chromozomes.remove(ch1);
            chromozomes.remove(ch2);
            if(eval.getFitness(ch1)< eval.getFitness(ch2))
                newChromozomes.add(ch1);
            else
                newChromozomes.add(ch2);
            System.out.println("Fitness chrom: " + eval.getFitness(ch1));


        }
        chromozomes = newChromozomes;

    }

    public void mutate(int numberOfMutations, double probability){
        for (int i = 0; i < numberOfMutations; i++) {
            Chromozome toMutate = chromozomes.get(new Random().nextInt(chromozomes.size()));
            toMutate.mutate(10);
            chromozomes.add(toMutate);

        }
    }

    public  void crossover(int numberOfCrossovers){
        for (int i = 0; i < numberOfCrossovers; i++) {
            Chromozome ch1 = chromozomes.get(new Random().nextInt(chromozomes.size()));
            Chromozome ch2 = chromozomes.get(new Random().nextInt(chromozomes.size()));
            Chromozome ch1Clone = ch1.cloneChromozome();
            Chromozome ch2Clone = ch2.cloneChromozome();
            ch1Clone.crossOver(ch2Clone);
            chromozomes.add(ch1Clone);
        }
    }
}