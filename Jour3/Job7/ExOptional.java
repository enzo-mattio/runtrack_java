package Jour3.Job7;
import java.util.Optional;
//Créez une méthode qui trouve la longueur d'une chaîne potentiellement null en utilisant
//Optional. Si la chaîne est null, retournez "Chaîne non fournie".
public class ExOptional {
    public static void main(String[] args) {
        String input = args.length > 0 ? args[0] : null;

        String result = getLengthOfString(input);
        System.out.println(result);
    }

    public static String getLengthOfString(String input) {
        Optional<String> optionalString = Optional.ofNullable(input);

        int length = optionalString.map(String::length).orElse(-1);

        if (length == -1) {
            return "Chaîne non fournie.";
        } else {
            return "Longueur de la chaîne : " + length;
        }
    }
}

