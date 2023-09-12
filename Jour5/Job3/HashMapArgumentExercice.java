package Jour5.Job3;

import java.util.HashMap;

public class HashMapArgumentExercice {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Utilisation : java HashMapArgumentExercice <cle> <valeur> <cle> <valeur>.....");
            System.exit(1);
        }
        HashMap<String, String> mots = new HashMap<>();
        for (int i = 0; i < args.length; i+=2) {
            mots.put(args[i], args[i+1]);
        }
        for (String mot : mots.keySet()) {
            System.out.println(mot + " : " + mots.get(mot));
        }
    }
}
