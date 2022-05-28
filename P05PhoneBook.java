package SetsAndMapsExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class P05PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> phonebook = new HashMap<>();
        String inputOne = sc.nextLine();

        while (!inputOne.equals("search")) {
            String[] personNumber = inputOne.split("-");
            String person = personNumber[0];
            String number = personNumber[1];
            phonebook.put(person,number);
            inputOne = sc.nextLine();
        }
        String inputTwo = sc.nextLine();
        while (!inputTwo.equals("stop")) {
            if (!phonebook.containsKey(inputTwo)) {
                System.out.printf("Contact %s does not exist.%n", inputTwo);
            } else {
                System.out.printf("%s -> %s%n", inputTwo, phonebook.get(inputTwo));
            }
            inputTwo = sc.nextLine();
        }
    }
}
