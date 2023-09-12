package Jour5.Job2;


import java.util.HashSet;
import java.util.List;

public class HashSetArgumentExercice {
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Utilisation : java HashSetArgumentExercice <mot> <mot> <mot>.....");
            System.exit(1);
        }
        HashSet<String> mots = new HashSet<>(List.of(args));

        for (String mot : mots) {
            System.out.println(mot);
        }
    }
}
