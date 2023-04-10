package priklad1;

import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HraciPole h = new HraciPole();
		HraciPole h2 = new HraciPole();
//      int counter = 0;
//      h.pohni(1);
        for (int i = 0; i < 10; i++) {
            h2.pohni(new Random().nextInt(4) + 1);
        }

/*        TreeSet<HraciPole> set = new TreeSet<>();
        set.add(h);
        set.add(h2);
        System.out.println("Tree set");
        System.out.println(h.compareTo(h2));
        System.out.println(h2.compareTo(h));
        System.out.println(" ");
*/


//		for(int i=1;i <=4; i++){
//			HraciPole h3 = h.klonujAPohni(i);
//			System.out.println(" Kopie s pohybem " +i+ "je: \n"+h3);
//			counter+=1;
//		}

//        System.out.println(h);

	//	System.out.println(counter);
	//	System.out.println("is solution " + h.jeReseni());
        BFS bfs = new BFS();
        bfs.vypisTahy(h2);
    }
}
