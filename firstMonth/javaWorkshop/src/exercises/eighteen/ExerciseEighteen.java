package exercises.eighteen;

import exercises.eighteen.classes.Serie;
import exercises.eighteen.classes.Videogame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExerciseEighteen {
    public static void main(String[] args) {
        Serie[] series = new Serie[5];
        Videogame[] videogames = new Videogame[5];
        series[0] = new Serie("bojack horseman", "animated","Raphael Bob-Waksberg", 6);
        series[1] = new Serie("black mirror", "terror","Zeppotron", 10);
        series[2] = new Serie("the witcher", "Sean Daniel Company");
        series[3] = new Serie("rick and morty", "J. Michael Mendel ");
        series[4] = new Serie("Peaky Blinders", "Otto Bathurst ");
        videogames[0] = new Videogame("the witcher", 70);
        videogames[1] = new Videogame("wow", 9999999);
        videogames[2] = new Videogame("enter the gungeon", 999);
        videogames[3] = new Videogame("tetris", 999999999);
        videogames[4] = new Videogame("Doom eternal", 70);
        series[0].deliver();
        series[4].deliver();
        videogames[3].deliver();
        videogames[0].deliver();
        videogames[2].deliver();
        ArrayList<Serie> series1 = countItems(series);
        ArrayList<Videogame> videogames1 = countItems(videogames);
        System.out.println("series delivered: " + series1.size());
        System.out.println(series1);
        System.out.println("videogames delivered: " + videogames1.size());
        System.out.println(videogames1);
        System.out.println("longest serie is:");
        longest(series);
        System.out.println("longest videogame is:");
        longest(videogames);
    }

    public static ArrayList<Videogame> countItems(Videogame[] array) {
        ArrayList<Videogame> list = new ArrayList<>();
        for (Videogame videogame : array) {
            if(videogame.isDelivered()) {
                list.add(videogame);
            }
        }

        return list;
    }
    public static ArrayList<Serie> countItems(Serie[] array) {
        ArrayList<Serie> list = new ArrayList<>();
        for (Serie serie : array) {
            if(serie.isDelivered()) {
                list.add(serie);
            }
        }
        return list;
    }
    public static void longest(Serie[] array) {

        Stream<Serie> sorted = Arrays.stream(array).sorted(Comparator.comparing(Serie::getNumberOfSeasons));
        List<Serie> collect = sorted.toList();
        System.out.println(collect.get(collect.size() - 1));
    }
    public static void longest(Videogame[] array) {

        Stream<Videogame> sorted = Arrays.stream(array).sorted(Comparator.comparing(Videogame::getEstimatedTime));
        List<Videogame> collect = sorted.toList();
        System.out.println(collect.get(collect.size() - 1));
    }



}
