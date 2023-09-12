package Jour5.Job1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListArgumentExercice {
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Utilisation : java ArrayListArgumentExercice <mot> <mot> <mot>.....");
            System.exit(1);
        }
        ArrayList<String> mots = new ArrayList<>(List.of(args));
        for (String mot : mots) {
            System.out.println(mot);
        }
    }
}
