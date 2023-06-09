package Jour04.Job02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main extends Thread{
    public static void main(String[] args) {
        // Demande à l'utilisateur de saisir la longueur de la chaîne
        // Mesure le temps d'exécution global
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la longueur de la chaîne : ");
        int length = scanner.nextInt();
        scanner.close();
        
        // Crée le fichier "output.txt" s'il n'existe pas et le vide s'il existe
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //déclaration de 4 threads
        Thread thread1 = new Thread(new Random(length));
        
        long startTime = System.nanoTime();
        //démarrage du threads
        thread1.start();

        
        
        //attente de la fin des threads

        try {
            thread1.join();
         
            
            
            
        } catch (InterruptedException e){
            e.printStackTrace();
        }
       

        double endTime = (double) System.nanoTime();
        double executionTime = (endTime - startTime) / 1000000;

        // Affiche le temps d'exécution
        System.out.println("Temps d'exécution : " + executionTime + " ms.");
    }
}
