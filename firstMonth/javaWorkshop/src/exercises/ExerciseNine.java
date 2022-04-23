package exercises;

import java.util.Scanner;

/*Del texto, “La sonrisa sera la mejor arma contra la tristeza”
Reemplaza todas las a del String anterior por una e, adicionalmente concatenar a esta
frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.*/
public class ExerciseNine {
    public static void main(String[] args) {
        result();
    }

    public static void result() {
        String phrase = "La sonrisas sera la mejor arma contra la tristeza";
        String alteredPhrase = changePhrase(phrase);
        String userPhrase = getPhrase();
        joinPhrases(alteredPhrase, userPhrase);
    }

    public static void joinPhrases(String str1, String str2) {
        System.out.println(str1 + " " + str2);
    }

    public static String changePhrase(String phrase) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'a') {
                stringBuilder.append("e");
                continue;
            }
            stringBuilder.append(phrase.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static String getPhrase() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
