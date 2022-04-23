package exercises;

import java.util.Objects;

import static exercises.ExerciseNine.getPhrase;

/*
*     Hacer un programa que muestre el siguiente menú de opciones
    ****** GESTION CINEMATOGRÁFICA ********
    1-NUEVO ACTOR
    2-BUSCAR ACTOR
    3-ELIMINAR ACTOR
    4-MODIFICAR ACTOR
    5-VER TODOS LOS ACTORES
    6- VER PELICULAS DE LOS ACTORES
    7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
    8-SALIR
    * EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8,
    * MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU
    * Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE
    * DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
    PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.
* */
public class ExerciseFifteen {
    public static void main(String[] args) {
        String input = "";
        do {
            printMenu();
            input = getPhrase();
        } while (checkInput(input));
    }

    public static void printMenu() {
        System.out.println("****** GESTION CINEMATOGRÁFICA ********");
        System.out.println("1-NUEVO ACTOR");
        System.out.println("2-BUSCAR ACTOR");
        System.out.println("3-ELIMINAR ACTOR");
        System.out.println("4-MODIFICAR ACTOR");
        System.out.println("5-VER TODOS LOS ACTORES");
        System.out.println("6- VER PELICULAS DE LOS ACTORES");
        System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
        System.out.println("8-SALIR");
    }

    public static boolean checkInput(String input) {
        if (!Objects.equals(input, "8")) {
            System.out.println("OPCION INCORRECTO");
            return true;
        }
        System.out.println("Bye bye");
        return false;

    }

}
