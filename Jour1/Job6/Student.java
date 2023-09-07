package Job6;

import java.util.Arrays;
import java.util.Scanner;

public class Student {

    static int[] notes = new int[0];
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = 0;
        while (choice != 6) {
            System.out.println("1. Add a note");
            System.out.println("2. Remove a note");
            System.out.println("3. Show all notes");
            System.out.println("4. Get average");
            System.out.println("5. Get notes");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> add_notes();
                case 2 -> remove_notes();
                case 3 -> show_all_notes();
                case 4 -> get_average();
                case 5 -> get_notes();
                case 6 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void get_notes() {
        System.out.println(Arrays.toString(notes));
    }
    private static void get_average() {
        int sum = 0;
        for (int i = 0; i < notes.length; i++) {
            sum += notes[i];
        }
        System.out.println("Average: " + sum / notes.length);
    }
    private static void add_notes() {

        System.out.println("Enter the note:");
        int note = sc.nextInt();
        notes = Arrays.copyOf(notes, notes.length + 1);
        notes[notes.length - 1] = note;

    }
    private static void remove_notes() {
        if (notes.length == 0) {
            System.out.println("No notes to remove.");
            return;
        }

        System.out.println("Enter the index of the note to remove:");
        int index = sc.nextInt();

        if (index < 0 || index >= notes.length) {
            System.out.println("Invalid index. Please enter a valid index.");
            return;
        }

        int[] newNotes = new int[notes.length - 1];
        int newIndex = 0;

        for (int i = 0; i < notes.length; i++) {
            if (i != index) {
                newNotes[newIndex] = notes[i];
                newIndex++;
            }
        }

        notes = newNotes;
        System.out.println("Note removed successfully.");
    }

    private static void show_all_notes() {
        System.out.println(Arrays.toString(notes));
    }
}
