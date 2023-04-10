package priklad1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class BFS {
    public void vypisTahy(HraciPole pole) {

        // TIP: Vyzkousejte s ruznyma strukturama
        // HashSet<HraciPole> closed = new HashSet<HraciPole>();
        TreeSet<HraciPole> closed = new TreeSet<HraciPole>();
        LinkedList<HraciPole> open = new LinkedList<HraciPole>();
        open.addFirst(pole);
        System.out.println(pole);
        for(;;){
            if (open.isEmpty()){
                System.out.println("Finished");
                return;
            }
            HraciPole tmp = open.removeLast();

//			System.out.println(tmp);  //vypisuje kroky
            if (tmp.jeReseni()){
                System.out.println("Riesenie je: " + tmp);
                System.out.println(tmp.getPohyby());
                return;
            }

            for (int i =1; i<= 4; i++){
                HraciPole n = tmp.klonujAPohni(i);
                if ((n!= null) && !(closed.contains(n))){
                    open.addFirst(n);
                    closed.add(n);
                }
            }



        }

    }
}