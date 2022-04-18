package exercises.one;


import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
 * Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
 * Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.
 * */
public class ExerciseOne {
    public static void main(String[] args) {
        try {
            double userNumber1 = getNumber();
            double userNumber2 = getNumber();
            String result = checkValues(userNumber1, userNumber2);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        boolean isValidNumber = isNumeric(userInput);
        if (isValidNumber) {
            return Double.parseDouble(userInput);
        }
        throw new IllegalStateException("Please input valid numbers");
    }

    public static String checkValues(double x, double y) {
        boolean bothEqual = x == y;
        boolean xIsGreater = x > y;
        String result = xIsGreater ? "" + x + " is greater than " + y : "" + y + "is greater than " + x;
        if (bothEqual) {
            return "Both are equal";
        }
        return result;
    }


    public static boolean isNumeric(String strNum) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }
}
