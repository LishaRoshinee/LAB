package lab;

import java.io.*;

public class MyFile {
    public static void main(String[] args) {
        File file = new File("Welcome.txt");

        try {
            if (file.exists()) {
                // If the file already exists, append "Software Engineering Department" to it
                FileWriter writer = new FileWriter(file, true);
                writer.write("Software Engineering Department");
                writer.close();
                System.out.println("Text appended to Welcome.txt");
            } else {
                // If the file doesn't exist, create a new file WelcomeAgain.txt and write "Welcome to UTeM" to it
                FileWriter writer = new FileWriter("WelcomeAgain.txt");
                writer.write("Welcome to UTeM");
                writer.close();
                System.out.println("WelcomeAgain.txt created and text written");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
