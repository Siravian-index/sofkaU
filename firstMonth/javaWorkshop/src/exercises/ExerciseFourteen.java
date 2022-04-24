package exercises;

import static exercises.ExerciseOne.getNumber;

/*
* Crear un programa que pida un numero por teclado y que imprima por pantalla
* los números desde el numero introducido hasta 1000 con saldos de 2 en 2.*/
public class ExerciseFourteen {
    public static void main(String[] args) {
        try {
            int number =  (int) getNumber();
            printSince(number);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printSince(int begin) {
        for (int i = begin; i <= 1000; i += 2) {
            System.out.println(i);
        }
    }

}
