package Jour3.Job6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MotsFiltresExo {
    public static void main(String[] args){
        if (args.length <= 2) {
            System.out.println("Utilisation : java MotsFiltresExo <value> <value> <value> ...");
            System.exit(1);
        }
        List<String> list = new ArrayList<>(Arrays.asList(args));
        List<String> list2 = list.stream().filter(x -> x.length() >= 3).filter(x -> x.startsWith("a")).toList();
        System.out.println("Resultat: " + list2);
    }
}
