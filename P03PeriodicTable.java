package SetsAndMapsExercise;

import java.util.Scanner;
import java.util.TreeSet;

public class P03PeriodicTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        TreeSet<String> elementsSet = new TreeSet<>();

        for (int i=0; i<number; i++) {
            String[] compound = sc.nextLine().split("\\s+");
            for (String j: compound) {
                elementsSet.add(j);
            }
            //Collections.addAll(compound,elementsSet);
        }
        for (String entry: elementsSet) {
            System.out.print(entry + " ");
        }
    }
}
