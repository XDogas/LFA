import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.lang.System.out;

public class Ex3 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        Map<String,Integer> map = new HashMap<>();
        Files.readAllLines(Paths.get("bloco1/numbers.txt")).forEach(line -> {
            String[] linearr = line.split(" - ");
            map.put(linearr[1], Integer.parseInt(linearr[0]));
        });

        while(true) {

            String[] inputs = in.nextLine().trim().replaceAll("\\s+"," ").split("[- ]");    // o replaceAll substitui as sequências de espaços por um só espaço
            for(String word : inputs) {
                try {
                    out.print(map.get(word) + " ");
                } catch(Exception e) {
                    out.print(word + " ");             //isto nao esta a acontecer
                }
            }

            out.println();
        }
    }
}
