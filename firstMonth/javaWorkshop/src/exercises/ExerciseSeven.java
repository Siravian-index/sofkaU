package exercises;

import static exercises.ExerciseOne.getNumber;

/*
 * Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
 * si no lo es lo volverá a pedir (do while), después muestra ese número por consola.*/
public class ExerciseSeven {
    public static void main(String[] args) {
        System.out.println("Type a positive number");
        askNumber();
    }

    public static void askNumber() {
        double number;
        try {
            do {
                 number = getNumber();
            } while (number < 0);
            System.out.println("Your number was: " + number);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
