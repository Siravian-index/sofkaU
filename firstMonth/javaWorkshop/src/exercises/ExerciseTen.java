package exercises;

import static exercises.ExerciseNine.getPhrase;

public class ExerciseTen {
    public static void main(String[] args) {
        String phrase = getPhrase();
        System.out.println(removeSpaces(phrase));
    }

    public static String removeSpaces(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == ' ')) {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
