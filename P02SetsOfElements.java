package SetsAndMapsExercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sets = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstSetSize = sets[0];
        LinkedHashSet<String> firstSet = new LinkedHashSet<>();
        for (int i=0; i<firstSetSize; i++) {
            firstSet.add(sc.nextLine());
        }
        int secondSetSize = sets[1];
        LinkedHashSet<String> secondSet = new LinkedHashSet<>();
        for (int i=0; i<secondSetSize; i++) {
            secondSet.add(sc.nextLine());
        }
        for (String element : firstSet) {
            if (secondSet.contains(element)) {
                System.out.print(element + " ");
            }
        }
    }
}
