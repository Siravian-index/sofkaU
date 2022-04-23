package exercises;

import java.util.Scanner;

/*
* Crea una aplicación por consola que nos pida un día de la semana
* y que nos diga si es un día laboral o no. Usa un switch para ello.
* */
public class ExerciseEight {
    public static void main(String[] args) {
        checkDay();
    }

    public static void checkDay() {
        Scanner input = new Scanner(System.in);
        String day = input.nextLine().toLowerCase();
        String weekMessage = "you have to work";
        String weekendMessage = "Free time!!";
        switch (day) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println(weekMessage);
            case "saturday", "sunday" -> System.out.println(weekendMessage);
            default -> throw new IllegalStateException("Unexpected value: " + day);
        }
    }
}
