package SetsAndMapsExercise;

import java.util.Scanner;
import java.util.TreeMap;

public class P04CountSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int occurences = 0;

        TreeMap<Character, Integer> library = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (!library.containsKey(current)) {
                library.put(current, 1);
            } else {
                int currentCharCount = library.get(current);
                library.put(current, ++currentCharCount);
            }
        }

        library.forEach((character, integer) -> System.out.println(character + ": " + library.get(character)
        + " time/s"));
    }
}

