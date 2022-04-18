package exercises;

import java.util.HashMap;

import static exercises.ExerciseNine.getPhrase;

/*Realizar la construcción de un algoritmo que permita de acuerdo a una
frase pasada por consola, indicar cual es la longitud de esta frase,
adicionalmente cuantas vocales tiene de “a,e,i,o,u”.*/
public class ExerciseEleven {
    public static void main(String[] args) {
        String phrase = getPhrase();
        System.out.println("phrase length is: " + phraseLength(phrase));
        System.out.println("aeiou amount: " + result(phrase));
    }

    public static HashMap<Character, Integer> result(String phrase) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('e', 0);
        map.put('i', 0);
        map.put('o', 0);
        map.put('u', 0);
        for (int i = 0; i < phrase.length(); i++) {
            boolean exists = map.containsKey(phrase.charAt(i));
            if (exists) {
                Integer integer = map.get(phrase.charAt(i));
                map.put(phrase.charAt(i), ++integer);
            }
        }
        return map;
    }

    public static int phraseLength(String phrase) {
        return phrase.length();
    }
}
