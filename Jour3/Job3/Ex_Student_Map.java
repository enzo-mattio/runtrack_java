package Jour3.Job3;


import java.util.Map;

public class Ex_Student_Map {
    public static void main(String[] args) {
        Map<String, String> student = new java.util.HashMap<String, String>();
        student.put("101", "Enzo");
        student.put("103", "Matteo");
        student.put("102", "Basile");
        student.put("104", "Gaetan");

        // affichage par numéro d'étudiant
        System.out.println("Affichage par numéro d'étudiant");
        for (String key : student.keySet()) {
            System.out.println(key + ": " + student.get(key));
        }
    }
}
