package priklad1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Map mapa = new HashMap();

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {      //nacitava file
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();        //citanie riadku

            while (line != null) {   //ked riadok neni null
                String[] words = line.split(" ");   //tu to pocita slova
                for (int i = 0; i < words.length; i++) {
                    if (mapa.get(words[i]) == null) {
                        mapa.put(words[i], 1);
                    } else {
                        int newValue = Integer.valueOf(String.valueOf(mapa.get(words[i])));
                        newValue++;
                        mapa.put(words[i], newValue);
                    }
                }
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

        Map<String, String> zoradena = new TreeMap<String, String>(mapa);
        for (Object k : zoradena.keySet()) {
            System.out.println("Slovo: " + k + "\t\t Pocet: " + mapa.get(k));
        }
    }
    }
}