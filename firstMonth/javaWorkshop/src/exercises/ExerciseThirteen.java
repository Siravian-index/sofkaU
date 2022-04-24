package exercises;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
public class ExerciseThirteen {
    public static void main(String[] args) {
        currentTime();
    }

    public static void currentTime() {
        formatTime(LocalDateTime.now());

    }
    public static void formatTime(LocalDateTime now) {
        String formatDate = now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        String formatHour = now.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
        System.out.println(formatDate + " " + formatHour);
    }
}
