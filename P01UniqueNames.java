package SetsAndMapsExercise;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class P01UniqueNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        LinkedHashSet<String> usernames = new LinkedHashSet<>();

        for (int i=0; i<number; i++) {
            String input = sc.nextLine();
            usernames.add(input);
        }
        usernames.forEach(System.out::println);
    }
}
