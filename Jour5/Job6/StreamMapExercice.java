package Jour5.Job6;

import java.util.stream.Stream;

public class StreamMapExercice {
    public static void main(String[] args){
        if (args.length <= 2) {
            System.out.println("Usage: java StreamMapExercice <name> <name>.....");
            System.exit(1);
        }
        Stream<String> stream = Stream.of(args);
        stream = stream.map(String::toUpperCase);
        String names = String.join(", ", stream.toArray(String[]::new));
        System.out.println("Noms en majuscule: " + names);
    }
}
