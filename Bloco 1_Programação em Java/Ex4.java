import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class Ex4 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        Map<String,Integer> map = new HashMap<>();
        Files.readAllLines(Paths.get("bloco1/numbers.txt")).forEach(line -> {
            String[] linearr = line.split(" - ");
            map.put(linearr[1], Integer.parseInt(linearr[0]));
        });

        while(true) {

            String[] inputs = in.nextLine().trim().replaceAll(","," ").replaceAll("-"," ").replaceAll("\\s+"," ").split(" ");    // o replaceAll substitui as sequências de espaços por um só espaço
            int result = 0;

            for(int i=0 ;i<inputs.length; i++) {
                int[] numbers = map.get(inputs[i].toLowerCase());
                if(number[i] < number[i+1]) {
                    result = numbers[i] * numbers[i+1];
                } else {
                    result = numbers[i] + numbers[i+1];
                }
            }

            out.println

            //for(String word : inputs) {
            //    String wordLower = word.toLowerCase();
            //    if(map.containsKey(wordLower)) out.print(map.get(wordLower) + " ");
            //    else out.print(word + " ");
            //}

            out.println();
        }
    }
}
