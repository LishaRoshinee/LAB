package lab;

import java.io.*;


class MyFileAPI extends File {
    MyFileAPI(String filename) {
        // Calling the constructor of the superclass (File) with the provided filename
        super(filename);
    }

    public static void main(String[] ar) throws Exception {
        // Creating an instance of MyFileAPI with the filename "My.txt"
        MyFileAPI myfile = new MyFileAPI("My.txt");
        
        // Checking if the file exists
        if (myfile.exists()) {
            System.out.println("File Exists!");
        } else {
            System.out.println("File does not exist! Try another file name");
        }
    }
}
