package Jour5.Job7;

import java.util.List;
import java.util.stream.Stream;

public class StreamCollectExercice {
    public static void main(String[] args){
        if (args.length <= 2) {
            System.out.println("Usage: java StreamFilterExercice <int> <int>.....");
            System.exit(1);
        }
        Stream<Integer> stream = Stream.of(args).map(Integer::parseInt);
        List<Integer> nombreSub25 = stream.filter(n -> n < 25)
                .toList();

        String nombreSub25String = String.join(", ", nombreSub25.stream().map(Object::toString).toArray(String[]::new));
        System.out.println("Nombres inferieurs à 25: " + nombreSub25String);
    }
}
