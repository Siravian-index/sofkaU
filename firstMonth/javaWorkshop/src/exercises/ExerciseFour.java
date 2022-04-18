package exercises;

import static exercises.ExerciseOne.getNumber;

/*
 * Lee un número por teclado que pida el precio de un producto (puede tener decimales)
 *  y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
 * */
public class ExerciseFour {
    public static void main(String[] args) {
        try {
            double number = getNumber();
            System.out.println(calculateIVA(number));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calculateIVA(double amount) {
        final double IVA = 0.21;
        double increment = amount * IVA;
        return amount + increment;
    }
}
