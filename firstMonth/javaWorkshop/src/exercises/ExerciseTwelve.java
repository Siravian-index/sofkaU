package exercises;


import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

/*Pedir dos palabras por teclado, indicar si son iguales,
sino son iguales mostrar sus diferencias.*/
public class ExerciseTwelve {
    public static void main(String[] args) {
        System.out.println("type two words");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        compareStrings(str1, str2);

    }

    public static void compareStrings(String str1, String str2) {
        String difference1 = StringUtils.difference(str1, str2);
        String difference2 = StringUtils.difference(str2, str1);
        if (str1.equals(str2)) {
            System.out.println("both are the same");
        } else {
            System.out.println("differences between words " + str1 + " and " + str2 + " are: " + difference1);
            System.out.println("differences between words " + str2 + " and " + str1 + " are: " + difference2);
        }
    }


}
